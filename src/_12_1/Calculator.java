package _12_1;

import java.util.InputMismatchException;
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

        try (sc) {
            System.out.println("Enter first number");
            int first = sc.nextInt();
            System.out.println("Enter operation");
            String operation = sc.next();
            System.out.println("Enter second number");
            int second = sc.nextInt();
            Calculator c = new Calculator();
            int result = c.calculation(operation, first, second);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: invalid operation");
        }

    }
}
