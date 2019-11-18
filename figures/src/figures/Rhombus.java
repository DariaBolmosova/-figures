package figures;

public class Rhombus extends Rectangle {
    private int height;


    public Rhombus(int a, int b, int height) {
        super(a, b);
        this.height = height;
    }

    @Override
    public int getSquare() {
        return this.a*this.height;
    }

    @Override
    public String toString() {
        return "Rhombus area : " + getSquare();
    }
}
