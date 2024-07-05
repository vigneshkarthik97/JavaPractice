import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Welcome to Bill's Burger Restaurant!!!!");
            System.out.println("What do you like to order? Press 1 for menu");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextInt()==1)
            {
                System.out.printf("Burger Meal Order:\n" +
                        "\t1. Regular Meal Order\n"+
                        "\t2. Or select your own Meal order:\n---->");
                Scanner scanner1 = new Scanner(System.in);
                String type=scanner1.nextLine();
                if(type.toUpperCase().charAt(0)=='R'){
                    MealOrder mealOrder=new MealOrder();
                    mealOrder.printMealOrder();
                    break;
                }
                else {
                    System.out.printf("Select your Burger Please:\n"+
                            "\t1. Regular Burger\n"+
                            "\t2. Medium Burger\n"+
                            "\t3. Large Burger\n"+
                            "\t4. Deluxe Burger\n+" +
                            "Enter the R or Regular for Regular Burger and likewise ----->");
                    String type2=scanner1.nextLine();
                    System.out.println("Enter the Price:");
                    int price=scanner.nextInt();
                    System.out.printf("Select your Drinks Please:\n"+
                            "\t1. Small Coke\n"+
                            "\t2. Medium Coke\n"+
                            "\t3. Large Coke\n"+
                            "Enter the S or Small for Small Coke and likewise ----->");
                    String type3=scanner1.nextLine();
                    System.out.println("Enter the Price:");
                    int price2=scanner.nextInt();
                    MealOrder mealOrder=new MealOrder(Burger.getBurger(type2,price),Drinks.getDrinks(type3,price2));
                    mealOrder.printMealOrder();
                    System.out.println("Do you want to do any changes on your order? (Y/N");
                    if(scanner1.nextLine().toLowerCase().equals("y"))
                    {
                        System.out.println("Do you want to change the size of Drinks? If yes, please input the size:");
                        String newSize=scanner1.nextLine();
                        System.out.println("Enter the price for the changed drinks:");
                        mealOrder.changeDrinkSize(newSize,scanner1.nextInt());
                        mealOrder.printMealOrder();
                        break;
                    }
                    else{
                        break;
                    }
                }

            }

        }

        System.out.println("Thanks Visit Again!!!");


    }

}
