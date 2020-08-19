package HomeWork2Lena;

public class Task3 {
    /* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while*/
    public static void main(String[] args) {
        String name = "Lena";
        int rows_number = 0;
        int repeat_times = 0;
        while (rows_number<5)
        {
            while (repeat_times<10)
            {
                repeat_times++;
                System.out.print(name + " ");
            }
            System.out.println();
            rows_number++;
            repeat_times=0;
        }
    }
}
