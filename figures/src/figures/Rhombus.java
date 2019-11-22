package figures;

public class Rhombus extends Rectangle {
    private int height;


    public Rhombus(int a, int height) {
        super(a, a);
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
