package hillelesson11;

public class Letter {
    private LetterState state;

    public void next(){
        state.next(this);
    }

    public void printState(){
        state.printState();
    }
    public void  setState (LetterState state){
        this.state=state;
    }

}
