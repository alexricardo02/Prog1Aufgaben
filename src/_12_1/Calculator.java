package _12_1;

import java.util.Scanner;

public class Calculator {

    public int calculation(String operation, int first, int second) {
        return switch (operation) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> 0;
        };
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter operation");
        String operation = sc.next();
        System.out.println("Enter second number");
        int second = sc.nextInt();

        Calculator c = new Calculator();

        try {
            c.calculation(operation, first, second);
        } catch (RuntimeException ignored) {

        }


    }
}
