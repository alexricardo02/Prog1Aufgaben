package Hausaufgaben;

import java.util.Scanner;

public class _4_22_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String first = sc.nextLine();
        String second = sc.nextLine();

        if (first.contains(second)){
            System.out.println(second + " is a substring of " + first);
        } else {
            System.out.println("they are not related");
        }
    }
}
