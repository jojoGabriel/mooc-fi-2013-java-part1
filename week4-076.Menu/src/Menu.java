
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
            return;
        }
        this.meals.add(meal);
    }
    
    public void printMeals() {
        for (String m : meals) {
            System.out.println(m);
        }    
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
