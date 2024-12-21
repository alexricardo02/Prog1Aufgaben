package Hausaufgaben;

import java.io.PrintStream;
import java.util.Scanner;

public class Aufgabe_3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean five_and_six = number % 5 == 0 && number % 6 == 0;
        boolean five_or_six = number % 5 == 0 || number % 6 == 0;
        boolean not_both = number % 5 == 0 ^ number % 6 == 0;

        System.out.println("Divisible by 5 and 6? " + five_and_six);
        System.out.println("Divisible by 5 or 6? " + five_or_six);
        System.out.println("Divisible by only one of them? " + not_both);
    }
}


