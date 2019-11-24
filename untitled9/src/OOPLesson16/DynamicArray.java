package OOPLesson16;

import java.util.Arrays;
                                          //денамически расщиряющийся массив

public class DynamicArray {
    private final int RATIO_EXPANDING = 2;
    private int []elements;
    private int counter;
    private char separator;

    public DynamicArray(int size,char separator) {
        elements=new int[size];
        this.separator=separator;
    }

    public int getSize(){
        return elements.length;
    }
    public int getIndex(int i){
        int result =0;
        if (i<elements.length&&i>=0) {
           result= elements[i];
        }
        return result;
    }

    public void put(int e){
        if(counter==elements.length-1){
          // int[]newArray= new int[elements.length*RATIO_EXPANDING];  не обязательна тк копи метод уже возвращает массив
            elements =Arrays.copyOf(elements,elements.length*RATIO_EXPANDING);
        }
        elements[counter]=e;
        counter++;
    }

    @Override
    public String toString() {
      //return "DynamicArray{"+"elements="+Arrays.toString(elements) +'}'; // стандартный метод ту стринг от 0 до 0
        //делам так чтобі в конце не віводились єлементі 0

        StringBuilder sb=new StringBuilder();  // для сложения строковых элементов
        sb.append("[");
        for (int i = 0; i <counter ; i++) {
           sb.append(elements[i]);
           sb.append(separator);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        DynamicArray da1=new DynamicArray(10,' ');
        for (int i = 0; i <25; i++) {
            da1.put(i);
        }
        System.out.println(da1.getSize());
        System.out.println(da1.toString());
        System.out.println(da1.getIndex(10));
    }
}
