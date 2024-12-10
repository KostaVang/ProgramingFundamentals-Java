package BasicSyntaxLab;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = n; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.printf("%d X %d = %d", i, j, (i * j));
                System.out.println();

            }
        }
    }
}