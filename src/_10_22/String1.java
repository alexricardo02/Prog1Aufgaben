package _10_22;

import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class String1 {

    public char[] chars;

    public String1 (char[] chars){
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }
    public int length() {
        return chars.length;
    }

    public String1 substring(int begin, int end) {
        return new String1(Arrays.copyOfRange(this.chars, begin, end));
    }

    public String1 toLowerCase() {
        for(int i = 0; i < this.chars.length; i++) {
            this.chars[i] = Character.toLowerCase(this.chars[i]);
        }
        return new String1(this.chars);
    }

    // Corregir problema con static
    // Cosas a repasar:
    //  - static
    //  - arreglos y sus metodos
    public static String1 valueOf(int i) {
        return new String1(this.chars[i]);
    }
}
