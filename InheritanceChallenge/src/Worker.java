import java.util.Calendar;

public class Worker {

    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge()
    {
        if(Integer.parseInt(this.birthDate.split("/")[0])> 4 && Integer.parseInt(this.birthDate.split("/")[1])>=5)
            return 2024-Integer.parseInt(this.birthDate.split("/")[2])-1;
        if(Integer.parseInt(this.birthDate.split("/")[1])>5)
            return 2024-Integer.parseInt(this.birthDate.split("/")[2])-1;

        return 2024-Integer.parseInt(this.birthDate.split("/")[2]);

    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate)
    {
        System.out.println(name+ "'s last day of work is "+endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
