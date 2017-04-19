package models;


import java.util.*;
import play.data.validation.*;
import javax.persistence.*;
import models.*;
import com.avaje.ebean.Model;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "main")
public class Food extends Model{
    
    @Id
    private Long foodId;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Meal> meals;

    @Constraints.Required
    private String foodName;

    @Constraints.Required
    private String suitable;

    @Constraints.Required
    private double kcal;
    
    @Constraints.Required
    private double protein;

    @Constraints.Required
    private double carbs;

    @Constraints.Required
    private double fat;

    @Constraints.Required
    private String mainMacro;


    public Food() {


    }


    public Food(Long foodId, String foodName, String suitable, double kcal, double protein, double carbs, double fat, String mainMacro) {
        this.foodId = foodId;
        this.suitable = suitable;
        this.foodName = foodName;
        this.kcal = kcal;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.mainMacro = mainMacro;
    }







    //Generic query helper for entity Computer with id Long
    public static Model.Finder<Long,Food> find = new Model.Finder<Long,Food>(Food.class);

    // Find all Posts in the database
    public static List<Food> findAll() {
        return Food.find.all();
    }

    public int rowCount(){
        return (find.where().findRowCount());
    }


    public Food generateProtein(String suitable){
       // Random r = new Random();
        System.out.println("suitable in generate protein: "+suitable);
       Food f = null;
       while(f == null){
        //   int random = r.nextInt(rowCount())+1;
         //  System.out.println("random w protein dla "+suitable +" " +random);
        f = find.where().eq("food_id", 2).and().eq("main", "protein").and().eq("suitable", suitable).findUnique();
    }
          return f;     
    }


    public Food generateFats(String suitable){

      //  Random r = new Random();
        System.out.println("suitable in generate fats: "+suitable);
        Food f = null;
        while(f == null){
        //    int random = r.nextInt(rowCount())+1;
            // System.out.println("random w carbs dla "+suitable + " " +random);
            f = find.where().eq("food_id", 3).and().eq("main", "fat").and().eq("suitable", suitable).findUnique();
        }
        return f;
    }


     public Food generateCarbs(String suitable){

        // Random r = new Random();
         System.out.println("suitable in generate carbs: "+suitable);
         Food f = null;
         while(f == null){
         //    int random = r.nextInt(rowCount())+1;
            // System.out.println("random w carbs dla "+suitable + " " +random);
             f = find.where().eq("food_id", 1).and().eq("main", "carbs").and().eq("suitable", suitable).findUnique();
         }
         return f;
     }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getSuitable() {
        return suitable;
    }

    public void setSuitable(String suitable) {
        this.suitable = suitable;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public String getMainMacro() {
        return mainMacro;
    }

    public void setMainMacro(String mainMacro) {
        this.mainMacro = mainMacro;
    }
}
