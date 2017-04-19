package models;

import java.util.*;
import javax.persistence.*;
import models.users.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

// Product Entity managed by the ORM
@Entity
public class Comment extends Model {

    // Properties
    // Annotate id as the primary key
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long comment_id;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String content;

    @ManyToOne
    private Post pc;

    @ManyToOne
    private User uc;


    // Default constructor
    public  Comment() {
    }



    // Constructor to initialise object
    public  Comment(Long id, String content, Post p) {
        comment_id = id;
        this.content = content;
        this.pc = p;
        

    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Comment> find = new Finder<Long,Comment>(Comment.class);

    // Find all Comments in the database
    public static List<Comment> findAll() {
        return Comment.find.all();
    }



    public Long getId() {
        return comment_id;
    }

    public void setId(Long id) {
        comment_id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPost(Post p){
	this.pc = p;
    }

    public Post getPost(){
	    return pc;
    }

    public void setUser(User uIn) {
        uc = uIn;
    }

    public User getUser() {
        return uc;
    }

	// might need to add user getters and setters later  

}
