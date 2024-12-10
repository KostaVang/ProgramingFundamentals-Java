package BasicSyntaxLab;

import java.util.Scanner;

public class EvenNumber_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1;   ; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());

            if (newNumber % 2 ==0){
                System.out.printf("The number is: %d\n",Math.abs(newNumber));
                break;
            }else{
                System.out.println("Please write an even number.");
            }}



    }
}
