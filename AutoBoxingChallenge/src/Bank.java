import java.util.ArrayList;
import java.util.ListIterator;

public class Bank {
    private ArrayList<Customer> customers;

    private String name;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void setCustomers(String name) {
        this.customers.add(0,new Customer(name));
    }

    public void doTransaction(String name, Double amount) {
        ListIterator iterator = this.customers.listIterator();
        while (iterator.hasNext()) {
            Customer customer = (Customer) iterator.next();
            if (customer.getName().equalsIgnoreCase(name)) {
                customer.getTransactions().add(amount);
            }
        }
        }

    public void printStatement() {
        System.out.println("List of Customers:");
        ListIterator iterator = this.customers.listIterator();
        while (iterator.hasNext()) {
            Customer customer = (Customer) iterator.next();
            System.out.println(customer.getName());
            for(Double d:customer.getTransactions())
                System.out.println(d.doubleValue());
        }
    }


}


