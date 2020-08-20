package Lesson3;

public class P3_Foreach {
    public static void main(String[] args) {
        String names[] = {"Vova", "Vytya", "Max", "AAA", "BBB"};
//        for (int i = 0; i < names.length; i++) {
//            if(i%2 == 0) {
//                names[i] = "*********"; // этим методом можно подменять переменные с массива
//            }
//            System.out.println(names[i]);
//        }

        for (String name: names) { // итерируемся по массиву с именами и присваиваем каждый раз переменной наме с массива
            System.out.println(name); // цикл называется foreach, только для чтения
        }
    }
}
