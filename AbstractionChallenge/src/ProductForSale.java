public abstract class ProductForSale {
    protected String type;
    protected String description;
    protected double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity){
        return this.price * quantity;
    }

    public void printItemizedLineItem(int quantity){
        System.out.format("""
                Item Quantity Price
                %s     %d      %.2f""",this.description,quantity,getSalesPrice(quantity));
    }



    public abstract void showDetails();
}

class Monitor extends ProductForSale {

    public Monitor(String description, double price) {
        super("Monitor", description, price);
    }

    @Override
    public void showDetails() {
        System.out.format("""
                Product Type Product Description Price
                %s     %s      %.2f""",this.type,this.description,this.price);
    }

}
class MacBook extends ProductForSale {

    public MacBook(String description, double price) {
        super("Monitor", description, price);
    }

    @Override
    public void showDetails() {
        System.out.format("""
                Product Type Product Description Price
                %s     %s      %.2f""",this.type,this.description,this.price);
    }

}
class MagicKeyboardMouse extends ProductForSale {

    public MagicKeyboardMouse(String description, double price) {
        super("Monitor", description, price);
    }

    @Override
    public void showDetails() {
        System.out.format("""
                Product Type Product Description Price
                %s     %s      %.2f""",this.type,this.description,this.price);
    }

}

