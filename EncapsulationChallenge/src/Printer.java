public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        int updatedTonerLevel=tonerLevel+tonerAmount;
        if(updatedTonerLevel>100 || updatedTonerLevel<0 )
            return -1;

        return updatedTonerLevel;
    }

    public int printPages(int pages){
        if(this.duplex) {
            System.out.println("It's a duplex Printer!!!");
            if (pages % 2 == 0) {
                pagesPrinted+=pages/2;
                return pages/2;
            }
            else {
                pagesPrinted += pages/2+1;
                return pages/2+1;
            }
        }
        else {
            pagesPrinted+=pages;
            return pages;
        }
    }
}
