package hillelesson11;

public class Main {
    public static void main(String[] args) {
        Letter letter= new Letter();
        letter.setState(new OrderState());
        letter.next();
        letter.printState();
        letter.next();
        letter.printState();
    }
}
