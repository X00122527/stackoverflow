package models.users;



import java.util.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("member")
@PrimaryKeyJoinColumn(referencedColumnName="email")
public class Member extends User{


    public Member() {

    }






}
