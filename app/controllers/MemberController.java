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
import java.io.File;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import views.html.*;

public class MemberController extends Controller {

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public MemberController(FormFactory formFactory, Environment env) {
        this.formFactory = formFactory;
        this.env = env;
    }

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }


        //Adding a post to the Newsfeed
    @Transactional
    public Result addPostSubmit() {
        String saveImageMsg;

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form
        Form<Post> newPostForm = formFactory.form(Post.class).bindFromRequest();
        //getUserFromSession();
        //List<Post> postsList = Post.findAll();
        // Check for errors (based on Product class annotations)
        if(newPostForm.hasErrors()) {
            // Display the form again
            return redirect(controllers.routes.HomeController.newsfeed());
        }

        // Extract the postfrom the form object
        Post p = newPostForm.get();
        p.setUser(getUserFromSession());
        Plike likes = new Plike();
        likes.setPost(p);
        likes.save();
        p.save();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(p.getId(), image);

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Post was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.newsfeed());
    }

    //Adding a comment to Post
    @Transactional
    public Result addCommentSubmit(Long id) {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Comment> newCommentForm = formFactory.form(Comment.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newCommentForm.hasErrors()) {
            // Display the form again
            return redirect(controllers.routes.HomeController.newsfeed());
        }

        // Extract the product from the form object
        Comment c = newCommentForm.get();
        c.setPost(Post.find.byId(id));
        c.setUser(getUserFromSession());
        c.save();


        

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Your Comment was added to the newsfeed.");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.newsfeed());
    }

    //Liking a Post
    @Transactional
    public Result giveLike(Long postId) {
        Post p = Post.find.byId(postId);
        p.likePost(getUserFromSession());
        p.update();
        return redirect(controllers.routes.HomeController.newsfeed());
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();
            if(mimeType.startsWith("image/")) {
                File file = uploaded.getFile();
                ConvertCmd cmd = new ConvertCmd();
                IMOperation op = new IMOperation();

                op.addImage(file.getAbsolutePath());
                op.resize(560, 420);

                op.addImage("public/images/postImages/" + id + ".jpg");

                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                thumb.addImage("public/images/postImages/thumbnails/" + id + ".jpg");

                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }

                return "and iamge saved";

            }
        }
        return "no file";
    }
}