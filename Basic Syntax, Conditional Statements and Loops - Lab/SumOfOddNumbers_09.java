package BasicSyntaxLab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum  = 0;
        int count = 0;
        for (int i = 1; i <=1000 ; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i);
                sum = sum + i;
            }
            if (count==n){
                break;
            }

        }
        System.out.println("Sum: "+  sum);
    }
}
