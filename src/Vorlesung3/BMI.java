package Vorlesung3;

import java.util.Scanner;

public class BMI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double gewicht;
        double grosse;

        System.out.println("Enter your weight: ");
        gewicht = sc.nextDouble();
        System.out.println("Enter your height: ");
        grosse = sc.nextDouble();

        double cuenta = gewicht / (grosse * grosse);

        if (cuenta < 18.5){
            System.out.println("Untergewicht");
        } else if (cuenta < 25.0) {
            System.out.println("Normalgewicht");
        } else if (cuenta < 30) {
            System.out.println("Ubergeweicht");
        } else {
            System.out.println("starkes Übergewicht");
        }


    }
}
