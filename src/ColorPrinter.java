public class ColorPrinter extends Printer {
    protected int red_ink;
    protected int green_ink;
    protected int blue_ink;

    public ColorPrinter(int paper, int black_ink, int red_ink, int green_ink, int blue_ink){
        super(paper, black_ink);
        this.red_ink = red_ink;
        this.green_ink = green_ink;
        this.blue_ink = blue_ink;
    }

    @Override
    public void refillInk(int ink) {
        super.refillInk(ink);
        this.red_ink += ink;
        this.green_ink += ink;
        this.blue_ink += ink;
    }

    public void refillInk(String color, int ink){
        if(color.equals("red")){
            this.red_ink += ink;
        }
        else if(color.equals("green")){
            this.green_ink += ink;
        }
        else if(color.equals("blue")){
            this.blue_ink += ink;
        }
    }
}
