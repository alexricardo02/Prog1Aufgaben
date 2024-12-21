package Hausaufgaben;

import java.util.Scanner;

public class Aufgabe_3_31 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double rate = sc.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double conversion = sc.nextInt();
        switch ((int) conversion) {
            case 0:
                System.out.println("Enter the dollar amount: ");
                double dollarAmount = sc.nextDouble();
                double RMBConversion = dollarAmount * rate;
                System.out.println(dollarAmount + " is "+ RMBConversion + " yuan.");
                break;
            case 1:
                System.out.println("Enter the RMB amount: ");
                double RMBAmount = sc.nextDouble();
                double DollarConversion = RMBAmount / rate;
                System.out.println(RMBAmount + " is " + DollarConversion + " Dollar.");
                break;
            default:
                System.out.println("Error, wrong nummber of conversion");
                break;
        }
        sc.close();
    }
}
