package HomeWork2Lena;

public class Task2 {
    /* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for*/
    public static void main(String[] args) {
        String name = "Lena";
        for (int repeat_times=0 ; repeat_times < 5; repeat_times++)
        {
            for (int string_number = 0; string_number < 10; string_number++)
            {
                System.out.print(name + " ");
            }
            System.out.println();
        }


    }
}
