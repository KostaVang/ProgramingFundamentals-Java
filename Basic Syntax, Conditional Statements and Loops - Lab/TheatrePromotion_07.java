package BasicSyntaxLab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOffWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (dayOffWeek.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                System.out.println("12$");
            } else if (age > 18 && age <= 64) {
                System.out.println("18$");
            } else if (age > 64 && age <= 122) {
                System.out.println("12$");
            }

        } else if (dayOffWeek.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                System.out.println("15$");
            } else if (age > 18 && age <= 64) {
                System.out.println("20$");
            } else if (age > 64 && age <= 122) {
                System.out.println("15$");
            }
        } else if (dayOffWeek.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                System.out.println("5$");
            } else if (age > 18 && age <= 64) {
                System.out.println("12$");
            } else if (age > 64 && age <= 122)
                System.out.println("10$");
        }

        if (age<0 || age > 122){
            System.out.println("Error!");

        }

}
}