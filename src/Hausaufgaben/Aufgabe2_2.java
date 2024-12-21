package Hausaufgaben;

import java.util.Scanner;


public class Aufgabe2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double radius;
        double length;
        double area;
        double volume;

        System.out.print("Radius: ");
        radius = sc.nextDouble();
        area = radius * radius * 3.14;

        System.out.print("Length: ");
        length = sc.nextDouble();
        volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);

    }
}
