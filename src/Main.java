public class Main {
    public static void main(String[] arg){
        ColorPrinter new_printer = new ColorPrinter(50, 50, 50, 50, 50);
        new_printer.refillInk(50);
        new_printer.refillInk("red", 100);
    }
}
