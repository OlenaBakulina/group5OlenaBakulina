package Lesson3;

public class O_Array {
    public static void main(String[] args) {
        int a = 21;
        a = 22; // так можно перезаписать значение для переменной
        //a = {2};
        String name = "Lena";
        boolean isTrue = true;
        int[] b = {56, 8, 0, -1};
        int[] c = {56, 8, 0, -1};
        boolean [] isBool = {true, false, true};
        String [] strs = {"Hello", "world"};
        b[2] = 1000000;// перезапись третьего элемента массива

        System.out.println(b[0]);//вывод первого элемента массива
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
