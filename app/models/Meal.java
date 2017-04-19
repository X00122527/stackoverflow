package models;

import java.util.*;
import javax.persistence.*;
import java.util.Random;
import models.users.*;
import com.avaje.ebean.Model;


@Entity
public class Meal extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mealId;

    @ManyToOne
    private Profile profile;

    // many to many mapping
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "meals")
    private List<Food> foods;


    private double totalKcal;

    private double totalCarbs;
    private double totalProtein;
    private double totalFat;
    private int mealNo;



    public Meal() {

    }

    public Meal(Profile uIn) {
        profile = uIn;

    }

    public Meal(Profile m, List<Food> foods, double totalKcal, double totalCarbs, double totalProtein, double totalFat) {
        this.profile = m;
        this.foods = foods;
        this.totalKcal = totalKcal;
        this.totalCarbs = totalCarbs;
        this.totalProtein = totalProtein;
        this.totalFat = totalFat;
    }

    public static Finder<Long, Meal> find = new Finder<Long, Meal>(Meal.class);


    public static List<Meal> findAll() {
        return Meal.find.all();
    }


    public long getMealId() {
        return mealId;
    }

    public void setMealId(long mealId) {
        this.mealId = mealId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public double getTotalKcal() {
        return totalKcal;
    }

    public void setTotalKcal(double totalKcal) {
        this.totalKcal = totalKcal;
    }

    public double getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(double totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public double getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(double totalProtein) {
        this.totalProtein = totalProtein;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public int getMealNo() {
        return mealNo;
    }

    public void setMealNo(int mealNo) {
        this.mealNo = mealNo;
    }



        public boolean hasMeal(){
            if(find.where().eq("PROFILE_PROFILE_ID", profile.getProfileId()).findRowCount() > 0){
                return true;
            }else{
                return false;
            }
        }

    public int rowCount(){
        int count = find.where().eq("PROFILE_PROFILE_ID", profile.getProfileId()).findRowCount();
        mealNo = count;
        System.out.println(count);

        return count;
    }

    public void generateProteinFood(String suitable) {
        //xd
        Food f = new Food();
        f = f.generateProtein(suitable);
        foods.add(f);
        System.out.println("adding protein..");
        double proteinRequiredPerMeal = (profile.getWeight() * 2.2) / profile.getNoOfMeal();
        double proteinAmount = (proteinRequiredPerMeal * 100) / f.getProtein();       // gram amount of food rich in protein
        double totalProteinCalories = (f.getKcal() * proteinAmount) / 100;
        totalProtein += proteinAmount;
        totalKcal += totalProteinCalories;

    }


    public void generateFatsFood(String suitable) {
        Food f = new Food();
        f = f.generateCarbs(suitable);
        foods.add(f);
        System.out.println("adding fat..");
        double fatsRequiredPerMeal = ((profile.getDaily_kcal() / 4) / 9) / profile.getNoOfMeal(); // grams of fats per meal
        double fatsAmount = (fatsRequiredPerMeal * 100) / f.getFat();
        double totalFatsCalories = (f.getKcal() * fatsAmount) / 100;
        totalFat += fatsAmount;

        totalKcal += totalFatsCalories;

    }


    public void generateCarbsFood(String suitable) {
        double leftcalories = (profile.getDaily_kcal()/profile.getNoOfMeal()) - totalKcal;
        Food f = new Food();
        f = f.generateCarbs(suitable);
        foods.add(f);
        System.out.println("adding carbs..");
        double carbsAmount = (leftcalories * 100) / f.getCarbs(); // grams of carbs
        double totalCarbsCalories = (f.getKcal() * carbsAmount) / 100;
        totalCarbs += carbsAmount;


        totalKcal += totalCarbsCalories;

    }




    public void generateMeal(String name) {

        generateProteinFood(name);
        generateFatsFood(name);
        generateCarbsFood(name);

    }

    public String getTimeOfDay() {
        System.out.println("MEALNO -> "+mealNo);
        if (rowCount() == 0) {
            System.out.println("returnuje morning");
            return "morning";
        }
            if (rowCount() == profile.getNoOfMeal()) {
                System.out.println("returnuje night");
            return "night";
        }else {
                System.out.println("returnuje afternoon");

                return "afternoon";
        }

    }
}