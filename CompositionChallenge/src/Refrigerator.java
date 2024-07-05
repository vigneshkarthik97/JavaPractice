public class Refrigerator extends Appliances{

    public void orderFood(){
        if(isHasWorkToDo()) {
            System.out.println("Here is your food!!");
            setHasWorkToDo(false);
        }
    }



}
