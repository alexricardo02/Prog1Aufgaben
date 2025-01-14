import java.util.ArrayList;
import java.util.Scanner;

public class _12_6 {

    public static int hex2Dec(String hexNumber) {
        int result = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            char actualDigit = hexNumber.charAt(i);
            if (!((actualDigit >= '0' && actualDigit <= '9') ||
                    (actualDigit >= 'A' && actualDigit <= 'F') ||
                    (actualDigit >= 'a' && actualDigit <= 'f'))) {
                throw new NumberFormatException("Wrong digit: " + actualDigit);
            }

            // Obtener el valor del dígito hexadecimal
            int value = 0;
            if (actualDigit >= '0' && actualDigit <= '9') {
                value = actualDigit - '0';
            } else if (actualDigit >= 'A' && actualDigit <= 'F') {
                value = 10 + (actualDigit - 'A');
            } else if (actualDigit >= 'a' && actualDigit <= 'f') {
                value = 10 + (actualDigit - 'a');
            }

            // Multiplicar por la potencia de 16 correspondiente a la posición
            result = result * 16 + value;
        }

        return result;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hex Number: ");
        String number = sc.nextLine();
        System.out.println(hex2Dec(number));

    }
}
