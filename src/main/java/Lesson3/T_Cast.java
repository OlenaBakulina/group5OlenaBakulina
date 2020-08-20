package Lesson3;

public class T_Cast {
    public static void main(String[] args) {
        int a = 456;
        //boolean c = a; это конфликт типов данных
        //long b = 1234567890123L;
        //long b = 456;
        double b = 4.54;
        int c = (int) b;// приведение типа от одного к другому
        //System.out.println(c);
        int d = 3;
        int e = 2;
        System.out.println((double) 3/2); //3.0/2
        //System.out.println(3.0/2); //3.0/2
    }
}
