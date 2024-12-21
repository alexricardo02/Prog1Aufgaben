package _10_3;

import java.util.Arrays;
import java.util.List;

public class MyInteger {

    public int value;

    public MyInteger (int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !(value % 2 == 0);
    }

    public boolean isPrime(){
        if (value < 2) return false;
        int count = 0;
        for(int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) count++;
        }

        return count == 0;
    }

    public static boolean isEven(int value) {
        MyInteger newInteger = new MyInteger(value);
        return newInteger.isEven();
    }

    public static boolean isOdd(int value) {
        MyInteger newInteger = new MyInteger(value);
        return newInteger.isOdd();
    }

    public static boolean isPrime(int value) {
        MyInteger newInteger = new MyInteger(value);
        return newInteger.isPrime();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public boolean equals(int newValue) {
        return this.value == newValue;
    }

    public boolean equals(MyInteger newValue) {
        return this.value == newValue.getValue();
    }

    public static int parseInt(char[] listOfChars) {
        StringBuilder result = new StringBuilder();
        for (char element : listOfChars) {
            result.append(element);
        }
        return Integer.parseInt(result.toString());
    }

    public static int parseInt(String newString) {
        List<Character> listOfNumbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        for(char s : newString.toCharArray()) {
            if (!listOfNumbers.contains(s)) {
                throw new IllegalArgumentException("Your string must be a number");
            }
        }
        return Integer.parseInt(newString);
    }











    public static void main(String[] args) {
        // Test the isPrime method with the number 4 (Expected output: false)
        System.out.println(new MyInteger(4).isPrime());

        // Test the isPrime method with the number 13 (Expected output: true)
        System.out.println(new MyInteger(13).isPrime());
    }
}
