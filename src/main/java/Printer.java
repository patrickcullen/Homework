public class Printer {

    private String name;
    private int paper;
    private int toner;

    public Printer(String name, int paper, int toner) {
        this.name = name;
        this.paper = paper;
        this.toner = toner;
    }

    public String getName(){
        return this.name;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public int acceptArgs(int copies, int pages) {
        int total = (copies * pages);
        if (total < this.paper) {
            this.paper -= total;
            this.toner -= total;
            return this.paper;
        }
            return this.paper;
    }

    public int fillPrinter(){
        this.paper = 400;
        return this.paper;
    }
}
