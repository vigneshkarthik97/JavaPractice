public class HourlyEmployee extends Employee{

    private double hourlyPay;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPay) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPay=" + hourlyPay +
                "} " + super.toString();
    }

    @Override
    public double collectPay() {
        return 30*8*hourlyPay;
    }

    public void getDoublePay()
    {
        System.out.println("Salary after double pay per day is: "+2*this.collectPay());
    }
}
