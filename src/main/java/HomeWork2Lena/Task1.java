package HomeWork2Lena;

public class Task1 {
    /*Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.*/
    public static int min (int a, int b, int c)
    {
        if (a<b && a<c) {
            return a;
        }else if (b<a && b<c) {
            return b;
        } else {
            return c;

        }
    }

    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }
}

