package Lesson3;

public class Q_Conditions {
    public static void main(String[] args) {
        int age = 25;
        int salary = 150;

        if(age < 18) {
            System.out.println("Access denied");
            //} else if ((age <= 50) && (salary > 100)){ // && логическая "и"
        }
        else if (age >= 50 || salary > 100 || (age > 20 && salary == 100)){// || логическая "или"
            System.out.println("Wellcome");
        }
        else {
            System.out.println("Good by");
        }
    }
}
