package Self_Study;

import java.awt.*;
import java.util.Scanner;

public class _2_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000: ");
        int number = sc.nextInt();

        int firstDigit = number % 10;  //234 -> 4
        int lastTwoDigits = number / 10; // 23
        int secondDigit = lastTwoDigits % 10; //23 -> 3
        int lastDigit = lastTwoDigits / 10; // 23 -> 2
        int result = firstDigit + secondDigit + lastDigit;

        System.out.println("Sum: " + result);
    }
}
