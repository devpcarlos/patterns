public class Rectangle {
    private int x;
    private int y;
    private int length;
    private int with;

    public Rectangle(int x, int y, int l, int w) {
        this.x = x;
        this.y = y;
        this.length = l;
        this.with = w;
    }

    public void oldDraw(){
        System.out.println("Drawing rectangle.");
    }

}
