public class Main {
    public static void main(String[] args) {
        Shape adapter = new RectangleAdapter(2,4,3,6);
        adapter.draw();

        Printer printer = new PrinterAdapter();


    }
}