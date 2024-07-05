public class Drinks {
    private String type;

    private String size;

    private int basePrice;

    public Drinks(int basePrice, String type) {
        this.basePrice = basePrice;
        this.type = type;
    }

    public static Drinks getDrinks(String type, int basePrice) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'M' -> new MediumDrinks(basePrice,type);
            case 'L' -> new LargeDrinks(basePrice,type);
            default -> new Drinks(basePrice,type);
        };
    }

    public void setSize(String size) {
        this.type = size;
    }

    public void displayETPrice(){
        System.out.println(type+" Coke costs "+basePrice);
    }

    public void setPrice(int newPrice) {
        this.basePrice=newPrice;
    }
}

class MediumDrinks extends Drinks{
    public MediumDrinks(int basePrice, String type) {
        super(basePrice, type);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}

class LargeDrinks extends Drinks{
    public LargeDrinks(int basePrice, String type) {
        super(basePrice, type);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}


