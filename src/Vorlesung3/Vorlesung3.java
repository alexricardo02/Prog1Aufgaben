package Vorlesung3;

import java.util.Scanner;

public class Vorlesung3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("Five");
        }
        if (number % 2 ==0)
            System.out.println("Even");
    }
}
