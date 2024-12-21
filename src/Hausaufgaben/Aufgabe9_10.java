package Hausaufgaben;

import java.util.Scanner;

public class Aufgabe9_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a");
        double a = sc.nextDouble();
        System.out.println("Enter your b");
        double b = sc.nextDouble();
        System.out.println("Enter your c");
        double c = sc.nextDouble();

        QuadraticEquation QE = new QuadraticEquation(a, b, c);

        if (QE.getDiscriminant() > 0) {
            System.out.println("Root 1:" + QE.getRoot1());
            System.out.println("Root 2:" + QE.getRoot2());
        } else if (QE.getDiscriminant() == 0) {
            System.out.println("Root 1:" + QE.getRoot1());
        } else {
            System.out.println("Equation has no roots");
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double Newa, double Newb, double Newc) {
        a = Newa;
        b = Newb;
        c = Newc;
    }

    public double getA() {
        return a;
    }

    public double getB(){
        return b;
    }

    public double getDiscriminant() {
        return (b*b) - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0 ) {
            return 0;
        } else {
            return (- b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        }
    }
    public double getRoot2() {
        if (getDiscriminant() < 0 ) {
            return 0;
        } else {
            return (- b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        }
    }
}
