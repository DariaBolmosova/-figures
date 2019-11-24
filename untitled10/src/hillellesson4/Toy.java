package hillellesson4;

public class Toy  {
    private final Shape shape;
public Toy(){
    this.shape=new Circle();
}
    public Toy(Shape shape) {
        this.shape = shape;
    }
public static Toy toyCreator(Shape shape){
    return  new Toy (shape); 
}
}
