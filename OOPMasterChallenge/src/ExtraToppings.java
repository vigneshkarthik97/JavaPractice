public class ExtraToppings {

    private String type;

    private int basePrice;

    public ExtraToppings(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public static ExtraToppings getToppings(String type, int basePrice) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'C' -> new CheeseToppings(type,basePrice);
            case 'L' -> new SauceToppings(type,basePrice);
            case 'S' -> new SummaToppings(type,basePrice);
        };
    }

    public void displayETPrice(){
        System.out.println(type+" Toppings costs "+basePrice);
    }


}

class CheeseToppings extends ExtraToppings{
    public CheeseToppings(String type, int price) {
        super(type, price);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}

class CorrianderToppings extends ExtraToppings{
    public CorrianderToppings(String type, int price) {
        super(type, price);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}

class SauceToppings extends ExtraToppings{
    public SauceToppings(String type, int price) {
        super(type, price);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}

class SummaToppings extends ExtraToppings{
    public SummaToppings(String type, int price) {
        super(type, price);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}

class DummyToppings extends ExtraToppings{
    public DummyToppings(String type, int price) {
        super(type, price);
    }

    @Override
    public void displayETPrice() {
        super.displayETPrice();
    }
}


