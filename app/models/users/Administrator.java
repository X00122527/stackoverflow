package models.users;

import java.util.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


@Entity
@DiscriminatorValue("admin")
@PrimaryKeyJoinColumn(referencedColumnName="email")
@Table(name = "Administrator")

// Administrator inherits from the User class
public class Administrator extends User{



    public Administrator()
    {

    }

}