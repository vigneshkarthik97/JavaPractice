public class MealOrder {

    private Burger burger;

    private Drinks drinks;

    public MealOrder(Burger burger, Drinks drinks) {
        this.burger = burger;
        this.drinks = drinks;
    }

    public MealOrder() {
        this.burger=new Burger("Regular",300);
        this.drinks=new Drinks(200,"Small");
    }

    public void changeDrinkSize(String size, int newPrice){
        this.drinks.setSize(size);
        this.drinks.setPrice(newPrice);
    }

    void printMealOrder() {
        this.burger.displayPrice();
        this.drinks.displayETPrice();
    }
}
