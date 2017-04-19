package models;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
import models.*;
import models.users.*;
import com.avaje.ebean.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Plike extends Model implements Serializable {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long likeId;

    private int likeCount;

    @ManyToMany(mappedBy = "likes")
    private List<User> users = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "PL_POST_ID", referencedColumnName = "POST_ID")
    private Post pl;

    public Plike() {

    }

    public Plike(Post p) {
        pl = p;
    }

    public Plike(Long likeId, int likeCount, List<User> users, Post pl) {
        this.likeId = likeId;
        this.likeCount = likeCount;
        this.users = users;
        this.pl = pl;
    }

    public static Finder<String, Plike> find = new Finder<String, Plike>(Plike.class);

    public static List<Plike> findAll() {
        return Plike.find.all();
    }

    public boolean checkIfLiked(User u) {
        boolean temp = false;
        for (int i = 0; i < users.size(); i ++) {
            if(users.get(i).getEmail() == u.getEmail()) {
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public void addUser(User u) {
        users.add(u);
        u.getLikes().add(this);
    }

    public void removeUser(User u) {
        users.remove(u);
        u.getLikes().remove(this);
    }

    public void remove() {
        ArrayList<User> temp = new ArrayList<>(users);
        for (int i = 0; i < temp.size(); i++) {
            removeUser(temp.get(i));
        }
    }

    public void setLikeId(Long idIn) {
        likeId = idIn;
    }



    public void setPost(Post pIn) {
        pl = pIn;
    }

    public Long getLikeId() {
        return likeId;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Post getPl() {
        return pl;
    }

    public void setPl(Post pl) {
        this.pl = pl;
    }

    public Post getPost() {
        return pl;
    }

    public void addLike(){
        likeCount++;
    }

    public void unLike() {
        likeCount--;
    }

    }  