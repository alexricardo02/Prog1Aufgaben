package Vorlesung3;

import java.util.Scanner;

public class Schaltjahr {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int jahr;
        System.out.print("Your year: ");
        jahr = sc.nextInt();

        if (jahr % 400 == 0) {
            System.out.println("Schaltjahr");
        } else if (jahr % 100 == 0){
            System.out.println("Kein Schaltjahr");
        } else  if (jahr % 4 == 0){
            System.out.println("Schaltjahr");
        } else {
            System.out.println("Kein Schaltjahr");
        }
    }
}
