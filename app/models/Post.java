package models;

import java.util.*;
import javax.persistence.*;
import models.users.*;
import models.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;
import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;


// Product Entity managed by the ORM
@Entity
public class Post extends Model implements Serializable {

    // Properties
    // Annotate id as the primary key
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long post_id;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String content;

    private Date date;

    @ManyToOne
    private User up;

    @OneToMany(mappedBy = "pc")
    List<Comment> comments = new ArrayList<>();


    @OneToOne(mappedBy = "pl", cascade = CascadeType.ALL)
    private Plike plike;

    // Default constructor
    public  Post() {
        this.date = new Date();
    }

    public Post(User u) {
        this.up = u;
    }

    // Constructor to initialise object
    public  Post(Long id, String content, User u, Plike plike) {
	    post_id = id;
        this.content = content;
        this.up = u;
        this.plike = plike;

    }


    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Post> find = new Finder<Long,Post>(Post.class);

    // Find all Posts in the database
    public static List<Post> findAll() {
        return Post.find.where()
                .orderBy("post_id desc")
                .findList();
    }



    public Long getId() {
        return post_id;
    }

    public void setId(Long id) {
        post_id= id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(User user){
	up = user;
    }

    public User getUser(){
	    return up;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

    public User getUp() {
        return up;
    }

    public void setUp(User up) {
        this.up = up;
    }

    public Plike getPlike() {
        return plike;
    }

    public void setPlike(Plike plike) {
        this.plike = plike;
    }

    public String getFormatDateTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm dd MMM yyyy ");
        String formatDateTime = format.format(date);
        return formatDateTime;
    }



    public void likePost(User u){
         if(!plike.checkIfLiked(u)) {
             plike.addUser(u);
             plike.addLike();
         } else {
             plike.removeUser(u);
             plike.unLike();
         }

         plike.update();
    }





}
