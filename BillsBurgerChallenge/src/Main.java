import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        MealOrder secondMeal = new MealOrder("turkey", "7-up",
                "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        MealOrder thirdMeal= new MealOrder("Deluxe","Coke","chilli");
        System.out.println("Hi");
    }
}
