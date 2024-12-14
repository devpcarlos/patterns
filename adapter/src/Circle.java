public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");

    }
}
