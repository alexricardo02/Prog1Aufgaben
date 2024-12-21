package Self_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _3_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar los 9 números: ");

        String input = sc.nextLine();

        String[] numbers = input.split(" ");

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            try {
                // Convertir cada número a entero y agregar a la lista
                numberList.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa solo números enteros pelotudo.");
                return;
            }
        }

        int result = 0;
        for (int i = 0; i < numberList.size(); i++){
            result += numberList.get(i) * (i+1);
        }

        System.out.println("The ISBN-10 number is " + input + result % 11);

        sc.close();
    }
}
