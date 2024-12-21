package Hausaufgaben;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aufgabe_3_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Write the first number: ");
        int first = sc.nextInt();
        numbers.add(first);
        System.out.println("Write the second number: ");
        int second = sc.nextInt();
        numbers.add(second);
        System.out.println("Write the third number: ");
        int third = sc.nextInt();
        numbers.add(third);

        Collections.sort(numbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
