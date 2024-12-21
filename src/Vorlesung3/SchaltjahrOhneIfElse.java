package Vorlesung3;

import java.util.Scanner;

public class SchaltjahrOhneIfElse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your year: ");
        int year = sc.nextInt();
        boolean schaltjahr = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        System.out.println("Is your year Schaltjahr? " + schaltjahr);

    }
}
