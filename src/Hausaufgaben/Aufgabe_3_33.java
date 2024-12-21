package Hausaufgaben;

import java.util.Scanner;

public class Aufgabe_3_33 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = sc.nextDouble();
        double price1 = sc.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = sc.nextDouble();
        double price2 = sc.nextDouble();

        double firstPrice = price1 / weight1;
        double secondPrice = price2 / weight2;

        if (firstPrice < secondPrice ) {
            System.out.println("Package 1 has a better price");
        } else if (firstPrice == secondPrice) {
            System.out.println("Both are good");
        } else {
            System.out.println("Package 2 has a better price");
        }
    }
}
