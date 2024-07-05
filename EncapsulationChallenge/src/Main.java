public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer(75,true);

        System.out.println("Adding extra 35% Toner: "+printer.addToner(35));
        System.out.println("Printing 10 pages: "+ printer.printPages(10));
        System.out.println("Printing 10 pages: "+ printer.printPages(10));

        System.out.println("Total Number of Pages printed: "+printer.getPagesPrinted());
        System.out.println("Remaining Toner Level: "+printer.getTonerLevel());

    }
}
