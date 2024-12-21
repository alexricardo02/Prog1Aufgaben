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
        // Crear objetos MyInteger
        MyInteger myInt1 = new MyInteger(12);
        MyInteger myInt2 = new MyInteger(17);

        // Testear métodos de instancia
        System.out.println("Testing instance methods:");
        System.out.println("myInt1 value: " + myInt1.getValue()); // 12
        System.out.println("myInt1 isEven: " + myInt1.isEven()); // true
        System.out.println("myInt1 isOdd: " + myInt1.isOdd());   // false
        System.out.println("myInt1 isPrime: " + myInt1.isPrime()); // false
        System.out.println("myInt2 value: " + myInt2.getValue()); // 17
        System.out.println("myInt2 isEven: " + myInt2.isEven()); // false
        System.out.println("myInt2 isOdd: " + myInt2.isOdd());   // true
        System.out.println("myInt2 isPrime: " + myInt2.isPrime()); // true

        // Testear métodos estáticos
        System.out.println("\nTesting static methods:");
        System.out.println("isEven(10): " + MyInteger.isEven(10)); // true
        System.out.println("isOdd(7): " + MyInteger.isOdd(7));     // true
        System.out.println("isPrime(19): " + MyInteger.isPrime(19)); // true
        System.out.println("isEven(myInt1): " + MyInteger.isEven(myInt1)); // true
        System.out.println("isOdd(myInt2): " + MyInteger.isOdd(myInt2));   // true
        System.out.println("isPrime(myInt2): " + MyInteger.isPrime(myInt2)); // true

        // Testear métodos equals
        System.out.println("\nTesting equals methods:");
        System.out.println("myInt1 equals 12: " + myInt1.equals(12)); // true
        System.out.println("myInt1 equals myInt2: " + myInt1.equals(myInt2)); // false
        System.out.println("myInt2 equals 17: " + myInt2.equals(17)); // true

        // Testear métodos parseInt
        System.out.println("\nTesting parseInt methods:");
        char[] charArray = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArray)); // 123
        String numericString = "456";
        System.out.println("parseInt(String): " + MyInteger.parseInt(numericString)); // 456

        // Testear excepción en parseInt con un string inválido
        System.out.println("\nTesting parseInt exception handling:");
        try {
            String invalidString = "45a";
            MyInteger.parseInt(invalidString);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
