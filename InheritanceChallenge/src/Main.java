public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Vignesh Raja", "05/05/1997","15/06/2024",15361877,"17/10/2022",50.5);

        System.out.println(hourlyEmployee);
        System.out.println(hourlyEmployee.name+"'s age is "+hourlyEmployee.getAge());
        System.out.println(hourlyEmployee.name+"'s monthly salary is:"+hourlyEmployee.collectPay());
        hourlyEmployee.getDoublePay();
    }
}
