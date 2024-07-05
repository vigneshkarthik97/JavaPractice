import java.util.Scanner;

public class InputChallenge {
    public static int sum=0;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        enterNumbers(scanner);
        System.out.println("The Sum is:"+sum);
    }

    public static void enterNumbers(Scanner scanner){
        int i=1;
        while(i<=5)
        {
                System.out.println("Enter the number " + i + ": ");
                String s = scanner.nextLine();
                try {
                    int num = Integer.parseInt(s);
                    i++;
                    sum+=num;
                } catch (NumberFormatException nfe){
                    System.out.println("Invalid Number! Try again");
                }
        }
    }
}
