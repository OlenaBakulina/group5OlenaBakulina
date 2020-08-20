package HomeWork2Lena;

public class Task5 {
    /* Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
     * например "Hello world!!!" -> "!!!dlrow olleH"*/
    public static void main(String args[]) {
        StringBuffer text = new StringBuffer("I am QA automation");
        text.reverse();
        System.out.println(text);
    }
}
