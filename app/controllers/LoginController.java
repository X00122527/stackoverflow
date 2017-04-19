package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;
import models.*;

public class LoginController extends Controller {

//    @Before
//    static void checkAuthentification() {
//        if(session.get("user") == null) login();
//    }

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }



    public Result login() {

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit() {

        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
        } else {
            session().clear();
            session("email", loginForm.get().getEmail());
        }

        return redirect(controllers.routes.HomeController.newsfeed());
    }

    public Result logout(){
        session().clear();
        flash("success", "You've  been logged out");
        return redirect(routes.LoginController.login());
    }

     public Result register() {
        Form<User> newUserForm = formFactory.form(User.class);

        return ok(register.render(newUserForm, User.getUserById(session().get("email"))));
    }


    @Transactional
    public Result addUserSubmit(){
        Form<Member> newUserForm = formFactory.form(Member.class).bindFromRequest();
        Member u = newUserForm.get();

        if(newUserForm.hasErrors()){

            flash("fail", "User " + u.getEmail() + " is already in our database.");
            //return badRequest(signup.render(newUserForm, getUserFromSession()));
            return redirect(controllers.routes.LoginController.register());
        }


        if (u.getEmail() != null) {
            u.save();
            flash("success", "User " + u.getEmail() + " has been registered.");
        }

        session("email", newUserForm.get().getEmail());

        return redirect(controllers.routes.HomeController.editProfile());
    }

    @Transactional
    public Result editProfileForm() {

        Form<Profile> newProfileForm = formFactory.form(Profile.class).bindFromRequest();
        Profile p = newProfileForm.get();
        p.setU(getUserFromSession());
        p.calculateDailyKcal();
        if (p.getProfileId() == null) {

            p.save();
        }
        else if (p.getProfileId() != null) {

            p.update();
        }


        if(newProfileForm.hasErrors()) {
            return redirect(controllers.routes.HomeController.editProfile());
        }

        return redirect(controllers.routes.HomeController.newsfeed());
    }

    @Transactional
    public Result setAdmin(String email) {
        Member m = (Member) User.find.ref(email);
        Profile p = m.getP();
        List<Post> posts = m.getPosts();
        List<Comment> comments = m.getComments();
        List<Plike> likes = m.getLikes();

        Member temp = m;
        Profile temp1 = p;
        List<Post> temp2 = posts;
        List<Comment> temp3 = comments;
        List<Plike> temp4 = likes;

        User.find.ref(email).delete();

        User.find.ref(email).getP().delete();

        for (int i = 0; i < temp2.size(); i++) {
            User.find.ref(email).getPosts().get(i).delete();
        }

        for (int i = 0; i < temp3.size(); i++) {
            User.find.ref(email).getComments().get(i).delete();
        }

        for (int i = 0; i < temp4.size(); i++) {
            User.find.ref(email).getLikes().get(i).delete();
        }




        Administrator a = new Administrator();
        a.setPosts(temp2);
        a.setComments(temp3);
        a.setLikes(temp4);

        a.setEmail(temp.getEmail());
        a.setName(temp.getName());
        a.setSurname(temp.getSurname());
        a.setPassword(temp.getPassword());
        a.save();

        temp1.setU(a);
        temp1.save();

        return redirect(controllers.routes.HomeController.usersview());


    }


}
    