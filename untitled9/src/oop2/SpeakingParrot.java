package oop2;

public class SpeakingParrot extends Parrot {
    private int linkedHumanWord;

    public SpeakingParrot(int linkedHumanWord){
        super(ParrotColor.blue);     //отссылка к конструктору базового класса
        this.linkedHumanWord=linkedHumanWord;
    }
}
