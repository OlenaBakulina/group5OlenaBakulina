package Lesson3;

public class V_Debug {
    public static void main(String[] args) {
        String name = "";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
            if (i % 2 == 0) {// если число будет кратным двум
                name += "A";// name = name + "A" - это две идентичные записи
            } else {
                name += "a";
            }
        }
        System.out.println(name);
    }
}
