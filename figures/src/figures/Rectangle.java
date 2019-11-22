package figures;

public class Rectangle implements Comparable<Rectangle> {
    protected int a ;
    protected int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSquare(){
        return this.a*this.b;
    }

    @Override
    public int compareTo(Rectangle r) {
        return this.getSquare() - r.getSquare();
    }

    @Override
    public String toString() {
        return "Rectangle are : " + getSquare();
    }
}

