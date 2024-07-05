public class Customer {

    private String name;

    private String email;

    private int creditLimit;

    public Customer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer()
    {
        this("Vignesh Raja","vigneshlk001@gmail.com");
    }

    public Customer(String name, String email) {
        this(name,email,10000000);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
