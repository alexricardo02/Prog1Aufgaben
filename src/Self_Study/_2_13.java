package Self_Study;

import java.util.Scanner;

public class _2_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amount = sc.nextDouble();
        double interest = 0.00417;
        double balance = amount;
        for (int i=0; i < 6; i++) {
            balance = (balance + amount) * (1 + interest);
        }
        System.out.println(balance);
    }
}
