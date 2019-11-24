public class Lz78 {


    private int number;//число
    private StringBuffer s;//буффер строки
    private char c;//символ

    //конструктор класса
    public Lz78(int n, StringBuffer b){
        this.number = n;
        this.s = b;
    }

    //конструктор класса
    public Lz78(int n, char c){
        this.number = n;
        this.c = c;
    }

    //прототипы методов и функций
    public int getNumber(){ return number; }
    public StringBuffer getSb(){ return s; }
    public char getChar(){ return c; }

}