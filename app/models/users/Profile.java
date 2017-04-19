package models.users;

import java.util.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
import java.time.Period;
import java.time.LocalDate;
import java.time.ZoneId;

@Entity
public class Profile extends Model{


    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long profileId;

    @OneToOne
    private User u;

    @OneToMany(mappedBy = "profile")
    private List<Meal> meals = new ArrayList<>();

    @Constraints.Required
    private Date dob;

    @Constraints.Required
    private String gender;

    @Constraints.Required
    private double height;

    @Constraints.Required
    private double weight;

    @Constraints.Required
    private double activityLevel;

    @Constraints.Required
    private String primaryGoal;

    @Constraints.Required
    private int noOfMeal;

    @Constraints.Required
    private double daily_kcal;




    public Profile(Long profileId, User u, Date dob, String gender, double height, double weight, double activityLevel, String primaryGoal, int noOfMeal, double daily_kcal) {
        this.profileId = profileId;
        this.u = u;
        this.dob = dob;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.activityLevel = activityLevel;

        this.primaryGoal = primaryGoal;
        this.noOfMeal = noOfMeal;
        this.daily_kcal = daily_kcal;
    }

    public Profile() {

    }
    public static Finder<Long, Profile> find = new Finder<Long, Profile>(Profile.class);

    public static List<Profile> findAll() {
        return Profile.find.all();
    }


    public void calculateDailyKcal(){
        double bmr = 0;
        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfBirth = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        if(gender.equals("male")){
            bmr = (10 * weight) +(6.25 * height) - (5 * age) + 5;
        }else{
            bmr = (10 * weight) +(6.25 * height) - (5 * age) - 161;
        }

        daily_kcal = bmr * activityLevel;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getPrimaryGoal() {
        return primaryGoal;
    }

    public void setPrimaryGoal(String primaryGoal) {
        this.primaryGoal = primaryGoal;
    }

    public int getNoOfMeal() {
        return noOfMeal;
    }

    public void setNoOfMeal(int noOfMeal) {
        this.noOfMeal = noOfMeal;
    }

    public double getDaily_kcal() {
        return daily_kcal;
    }

    public void setDaily_kcal(double daily_kcal) {
        this.daily_kcal = daily_kcal;
    }



    public List<Meal> getMeals() {
        return meals;
    }


    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }


}