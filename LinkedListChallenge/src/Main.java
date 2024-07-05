import java.lang.invoke.SwitchPoint;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    record Place(String name, int distance){

        @Override
        public String toString() {
            return "From Sydney to " + name + " Distance: " + distance;
        }
    }

    public static void main(String[] args) {

        LinkedList<Place> places = new LinkedList<>();

//        addPlace(places,new Place("Sydney",0));
        addPlace(places,new Place("Adelaide",1374));
        addPlace(places,new Place("Alice Springs",2771));
        addPlace(places,new Place("Brisbane",917));
        addPlace(places,new Place("Darwin",3972));
        addPlace(places,new Place("Melbourne",877));
        addPlace(places,new Place("Perth",3923));

       Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        ListIterator iterator=places.listIterator();
       while(flag){
           menuOptions();
           String s= scanner.nextLine();
           switch (s.toUpperCase().charAt(0)){
               case 'Q' -> { flag=false;
               }
               case 'M'-> menuOptions();
               case 'L'->listPlaces(places);
               case 'F'-> {
                   if (iterator.hasNext()) {
                       System.out.println(iterator.next().toString());
                   } else {
                       flag=false;
                   }
               }
               case 'B'-> {
                   if (iterator.hasPrevious())
                       System.out.println(iterator.previous().toString());
                   else {
                       flag=false;
                   }
               }
               default-> System.out.println("Invalid option!! Try again");
           }
       }


    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        if(!places.contains(place)) {
            places.add(place);
        }
    }

    private static void listPlaces(LinkedList<Place> places) {
        ListIterator iterator = places.listIterator(1);
        while(iterator.hasNext()){
            var place=iterator.next();
            System.out.println(place);

        }
    }

    private static void menuOptions(){
        System.out.format("""
                Available actions (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
