public class Burger {
    private String type;
    private int basePrice;

    public Burger(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public static Burger getBurger(String type, int basePrice) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'M' -> new MediumBurger(type,basePrice);
            case 'L' -> new LargeBurger(type,basePrice);
            case 'D' -> new DeluxeBurger(type,basePrice);
            default -> new Burger(type, basePrice);
        };
    }

    public void displayPrice(){
        System.out.println(type+" Burger costs "+basePrice+" and allowed upto 3 Toppings");
    }


}

class MediumBurger extends Burger{

    public MediumBurger(String type, int basePrice) {
        super(type, basePrice);
    }

    @Override
    public void displayPrice() {
        super.displayPrice();
    }
}

class LargeBurger extends Burger{
    public LargeBurger(String type, int basePrice) {
        super(type, basePrice);
    }

    @Override
    public void displayPrice() {
        super.displayPrice();
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger(String type, int basePrice) {
        super(type, basePrice);
    }

    @Override
    public void displayPrice() {
        super.displayPrice();
        System.out.println("Extra two toppings allowed with no price!!!");
    }
}