public class SmartKitchen{
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster=new CoffeeMaker();
        this.dishWasher=new DishWasher();
        this.iceBox=new Refrigerator();
    }

    public void setKitchenState(boolean coffeeFlag,boolean dishWasherFlag, boolean iceBoxFlag)
    {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(iceBoxFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
