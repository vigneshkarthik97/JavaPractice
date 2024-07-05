public class Main {

    public static void main(String[] args) {
        BankAccount vignesh=new BankAccount();

        vignesh.setAccountNumber(1536334);
        vignesh.setEmail("vigneshlk001@gmail.com");
        vignesh.setAccountBalance(100000);
        vignesh.setCustomerName("Vignesh Raja K");
        vignesh.setPhoneNumber(994108135);

        vignesh.depositMoney(25000);
        vignesh.withdrawMoney(110000);
    }
}
