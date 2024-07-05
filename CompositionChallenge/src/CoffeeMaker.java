public class CoffeeMaker extends Appliances{


    public void brewCoffee(){
        if(isHasWorkToDo()) {
            System.out.println("Dispensing Coffee with a grrrrrrrr sound!!!!!");
            setHasWorkToDo(false);
        }
    }

}
