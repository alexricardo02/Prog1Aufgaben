package Hausaufgaben;

import java.util.Scanner;

public class Aufgabe_2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double feet;
        double meter;

        System.out.print("Enter a value for feet: ");
        feet = sc.nextDouble();

        meter = feet * 0.305;

        System.out.println(feet + "feet is " + meter + " meters.");
    }
}
