package HomeWork2Lena;

public class Task4 {
    /* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while*/
    public static void main(String[] args) {
        String name = "Lena";
        int rows_number = 5;
        do {
            int repeat_times = 10;
            do {
                System.out.print(name+ " ");
                repeat_times--;
            }
            while (repeat_times>0);
            System.out.println();
            rows_number--;
        }
        while (rows_number>0);
    }
}
