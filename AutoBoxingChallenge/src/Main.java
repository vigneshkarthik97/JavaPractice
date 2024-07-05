public class Main {

    public static void main(String[] args) {
        Bank icici=new Bank("ICICI");

        icici.setCustomers("Vignesh Raja");
        icici.setCustomers("Kaviya");
        icici.doTransaction("Vignesh Raja",120000.00);
        icici.doTransaction("Vignesh Raja",120000.00);
        icici.doTransaction("Vignesh Raja",150000.00);
        icici.doTransaction("Kaviya",60000.00);
        icici.printStatement();
    }
}
