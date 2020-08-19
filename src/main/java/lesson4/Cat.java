package lesson4;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Max");
        int age = 105;
        cat.setAge(age);
        int actualAge = cat.getAge();
        int expectedAge = age;
        if(actualAge != expectedAge) {
            throw new Error("Validation failed");

        }
    }
}
