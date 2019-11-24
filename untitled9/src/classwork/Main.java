package classwork;

public class Main {
    public static int Bonus = 10;

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 10};
        //showArray(a);
        addBonus(a);
        System.out.println(a[a.length - 1]);
        int[]penalSelary=subBonus(a);
        showArray(penalSelary);
        showArray(a);
    }

    public static int[] subBonus(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - Bonus * 2;
        }
        return result;
    }

    public static void addBonus(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + Bonus;

        }

    }

    public static void showArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + ";");
        }
        System.out.println();
    }


}

