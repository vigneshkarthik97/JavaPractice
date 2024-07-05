import java.util.Scanner;

public class InputChallengePartTwo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!flag){
            System.out.println("Enter number or Enter any character to exit:");
            String s=scanner.nextLine();
            try {
                int num = Integer.parseInt(s);
                if(num>max)
                    max=num;
                if(num<min)
                    min=num;
            }catch (NumberFormatException nfe)
            {
                flag=true;
            }
        }

        System.out.println("The maximum number is:"+max);
        System.out.println("The minimum number is:"+min);
    }

}
