public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void depositMoney(int money){
        this.accountBalance+=money;
        System.out.println("The new balance is:"+this.accountBalance);
    }

    public void withdrawMoney(int money){
        if(this.accountBalance-money <0)
            System.out.println("Insufficent funds");
        else {
            this.accountBalance -= money;
            System.out.println("The new available balance:" + this.accountBalance);
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
