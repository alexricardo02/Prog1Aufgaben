package Self_Study;

import java.util.Scanner;

public class _3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        boolean isPalindrome = true;
        for (int i=0; i < (number.length()/2); i++) {
            char lastChar = number.charAt(number.length()-i-1);
            if (number.charAt(i) != lastChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();

    }

}