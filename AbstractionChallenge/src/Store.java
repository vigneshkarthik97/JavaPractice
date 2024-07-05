import java.util.ArrayList;

public class Store {
    record OrderItem(int quantity, ProductForSale productForSale){

    }

    private static ArrayList<ProductForSale> productForSales = new ArrayList<>();
    private static ArrayList<OrderItem> orderItems = new ArrayList<>();


    public static void main(String[] args) {
        displayProductDetails();
        addItemtoOrder("Monitor",3);
        addItemtoOrder("Laptop",4);
       printOrderItems();
    }

    public static void displayProductDetails(){
        productForSales.add(new Monitor("Dell Ultrasharp 27 Inch", 7500.00));
        productForSales.add(new MacBook("Macbook Pro A214",55000.00) );
        productForSales.add(new MagicKeyboardMouse("Magic Keyboard Mouse", 2500.00));

//        for(ProductForSale productForSale : productForSales){
//            productForSale.showDetails();
//        }
    }

    public static void addItemtoOrder(String item, int quantity){
        switch (item.toUpperCase().substring(0,1)){
            case "M":orderItems.add(new OrderItem(quantity, productForSales.get(0)));break;
            case "L":orderItems.add(new OrderItem(quantity, productForSales.get(1)));break;
            case "P":orderItems.add(new OrderItem(quantity, productForSales.get(2)));break;
        }
    }

    public static void printOrderItems(){
        for(OrderItem orderItem : orderItems){
            orderItem.productForSale.printItemizedLineItem(orderItem.quantity);
        }
    }


}