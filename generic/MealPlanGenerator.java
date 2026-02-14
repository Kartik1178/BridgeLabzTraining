/*
 * MealPlanGenerator
 *
 * Demonstrates Generic Methods and Bounded Type Parameters
 * for generating validated meal plans.
 */
interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian Meal"; }
}

class VeganMeal implements MealPlan {
    public String getMealType() { return "Vegan Meal"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto Meal"; }
}

class Meal<T extends MealPlan> {
    T meal;
    public Meal(T meal) { this.meal = meal; }
    public T getMeal() { return meal; }
}

public class MealPlanGenerator {

    // Generic method to generate meal plan
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated: " + meal.getMealType());
    }
//main method for testing
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        generateMealPlan(vegMeal.getMeal());
    }
}
