package hillelesson11;

public class Counter {
    private Integer value;
    private Strategy strategy;
    public void Exsecute (int value1, int value2){
        value=strategy.execute(value1,value2);
    }
}
