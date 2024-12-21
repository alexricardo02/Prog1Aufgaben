package Vorlesung7;

import java.util.Scanner;

public class _6_4_ {

    // Complexity O(n)
    // StringBuilder more efficient
    // 
    public static int reverse(int number){
        String normalNum = String.valueOf(number);
        StringBuilder reversedNum = new StringBuilder();
        for(int i = normalNum.length(); i>0; i--) {
            char current = normalNum.charAt(i-1);
            reversedNum.append(current);
        }
        return Integer.parseInt(reversedNum.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        System.out.print(reverse(number));
    }
}
