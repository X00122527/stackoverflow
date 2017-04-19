package controllers;

import controllers.*;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import models.users.*;
import models.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    private FormFactory formFactory;


 private Environment env;



    @Inject
    public HomeController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

   private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }



    @Security.Authenticated(Secured.class)
    public Result meals() {
        //List<Meal> mealList = (List)Meal.find.where().eq("PROFILE_PROFILE_ID", getUserFromSession().getP().getProfileId());
        //generateDiet();
        List<Meal> mealList = Meal.findAll();
        return ok(meals.render(getUserFromSession(), mealList));
    }


    @Security.Authenticated(Secured.class)
    public Result editProfile(){
            Form<Profile> editProfileForm = formFactory.form(Profile.class);

            //editProfileForm = editProfileForm.fill(Profile.find.where().eq("U_EMAIL", getUserFromSession().getEmail()).findUnique());

           // editProfileForm = editProfileForm.fill(Profile.find.where().eq("U_EMAIL", getUserFromSession().getEmail()).findUnique());

	        return ok(editProfile.render(getUserFromSession(), editProfileForm));
        }

    @Security.Authenticated(Secured.class)
    public Result newsfeed() {
        List<Post> postsList = Post.findAll();
	    Form<Post> addPostForm = formFactory.form(Post.class);
        Form<Comment> addCommentForm = formFactory.form(Comment.class);
        List<Comment> commentsList = Comment.findAll();
        Post p = new Post();


	    return ok(newsfeed.render(addPostForm, addCommentForm, postsList, commentsList, getUserFromSession(), p, env));
    }

    @Transactional
    public Result generateDiet() {
        Profile p = Profile.find.where().eq("U_EMAIL", getUserFromSession().getEmail()).findUnique();
        // Extract the postfrom the form object
        //for (int i = 0; i < p.getNoOfMeal(); i ++) {
            Meal m = new Meal();
            m.setProfile(p);
          //  String x = m.getTimeOfDay();
            String x = "afternoon";
            m.generateMeal(x);
            m.save();
      ///  }


        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Post was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.meals());
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result foodsview() {
        List<Food> foodsList = new ArrayList<Food>();
        Form<Food> addFoodForm = formFactory.form(Food.class);

        foodsList = Food.findAll();

        return ok(foodsview.render(addFoodForm, foodsList, getUserFromSession()));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result usersview() {
        List<User> usersList = new ArrayList<User>();

        usersList = User.findAll();

        return ok(usersview.render(usersList, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteUser(String email) {

        // find user by id and call delete method
        User.find.ref(email).delete();
        // Add message to flash session
        flash("success", "User has been deleted");

        // Redirect to usersview page
        return redirect(routes.HomeController.usersview());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteFood(Long id) {

        // find user by id and call delete method
        Food.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Food has been deleted");

        // Redirect to usersview page
        return redirect(routes.HomeController.foodsview());
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addFood() {

        // in a FormFactory form instance
        Form<Food> addFoodForm = formFactory.form(Food.class);

        // Render the Add Movie View, passing the form object
        return ok(addFood.render(addFoodForm, getUserFromSession()));
    }


    @Transactional
    public Result addFoodSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Food> newFoodForm = formFactory.form(Food.class).bindFromRequest();
        // need to cast into carbsfood or proteinfood... here?



        // Check for errors (based on Product class annotations)
        if(newFoodForm.hasErrors()) {
            // Display the form again
            return badRequest(addFood.render(newFoodForm, getUserFromSession()));
        }


        Food f = newFoodForm.get();
        // Extract the product from the form object

        if(newFoodForm.get().getMainMacro().equals("Protein")) {
            f = new ProteinFood();

        } else if(newFoodForm.get().getMainMacro().equals("Carbohydrates")) {
            f = new CarbsFood();
        } else {
            f = new FatFood();
        }

        f.setFoodName(newFoodForm.get().getFoodName());
        f.setMainMacro(newFoodForm.get().getMainMacro());
        f.setKcal(newFoodForm.get().getKcal());
        f.setProtein(newFoodForm.get().getProtein());
        f.setCarbs(newFoodForm.get().getCarbs());
        f.setFat(newFoodForm.get().getFat());
        f.setSuitable(newFoodForm.get().getSuitable());


        if (f.getFoodId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            f.save();
        }
        // Product already exists so update
        else if (f.getFoodId() != null) {

            f.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Food " + f.getFoodName() + " has been created/ updated");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.foodsview());
    }










    



    

}
