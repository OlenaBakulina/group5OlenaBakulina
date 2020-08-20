package Lesson3;

public class M_Sout {
    public static void main(String[] args) {
        System.out.println("test test");
        System.out.println("test test");
        System.out.print("lena Lena ");// эта и следующая строка выведутся без переноса на новую строку
        System.out.print("lena1 Lena1 \n");
        String name1 = "Lena";
        String name2 = "Max";
        System.out.println("Hello user 'Lena', my name is 'Max'");
        System.out.printf("Hello user '%s', my name is '%s'",name1, name2);
    }
}
