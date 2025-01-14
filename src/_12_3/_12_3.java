package _12_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _12_3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(sc) {
            int[] randomNumbers = new int[100];
            Random random = new Random();

            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = random.nextInt(1000); // Generates random integers between 0 and 999
            }

            System.out.println("Enter an index between 0 and 100");
            int index = sc.nextInt();
            System.out.println(randomNumbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

    }
}
