package Hausaufgaben;

import java.util.Scanner;

public class Aufgabe_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsiusGrad;
        double fahrenheit;

        System.out.println("Enter a degree in Celsius: ");
        celsiusGrad = sc.nextDouble();

        fahrenheit = 1.8 * celsiusGrad + 32;

        System.out.println(celsiusGrad + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
