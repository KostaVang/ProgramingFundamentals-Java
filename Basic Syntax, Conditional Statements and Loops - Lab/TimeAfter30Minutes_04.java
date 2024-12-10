package BasicSyntaxLab;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentHours = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int hoursIntoMinutes = currentHours * 60;

        int totalTime = currentMinutes + hoursIntoMinutes + 30;

        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        if (hours > 23){
            hours = 0;
        System.out.printf("%d:%02d",hours,minutes);
        }else {
            System.out.printf("%d:%02d",hours,minutes);

        }

    }
}
