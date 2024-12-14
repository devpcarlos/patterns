public class RectangleAdapter implements Shape{

    private Rectangle adapte;

    public RectangleAdapter(int x, int y, int l, int w) {
        this.adapte = new Rectangle(x,y,l,w);
    }

    @Override
    public void draw() {
        adapte.oldDraw();
    }
}
