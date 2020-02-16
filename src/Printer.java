public class Printer {
    protected int paper;
    protected int black_ink;

    public Printer(int paper, int black_ink){
        this.paper = paper;
        this.black_ink = black_ink;
    }

    public void refillInk(int ink){
        this.black_ink += ink;
    }
}
