public class DishWasher extends Appliances {


    public void doDishes(){
        if(isHasWorkToDo()) {
            System.out.println("Washing the dishes!!!");
            setHasWorkToDo(false);
        }
    }
}
