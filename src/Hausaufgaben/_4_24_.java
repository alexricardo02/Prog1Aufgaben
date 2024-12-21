package Hausaufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _4_24_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> countries = new ArrayList<>();
        System.out.println("Enter the first city:");
        String city1 = sc.nextLine();
        countries.add(city1);
        System.out.println("Enter the second city:");
        String city2 = sc.nextLine();
        countries.add(city2);
        System.out.println("Enter the third city:");
        String city3 = sc.nextLine();
        countries.add(city3);
        Collections.sort(countries);
        System.out.print(countries);




    }
}
