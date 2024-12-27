package test_package;

import _10_23_.MyString2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class test_10_23 {

    @Test
    void testSubstringValidIndex() {
        MyString2 myString = new MyString2("Hola, mundo!");

        // Caso 1: Substring desde un índice válido
        MyString2 result = myString.substring(7);
        assertEquals("mundo!", result.string);
    }

    @Test
    void testUpperCase() {
        MyString2 myString = new MyString2("elMundoVariable");

        MyString2 string = myString.toUpperCase();
        assertEquals("ELMUNDOVARIABLE", string.string);
    }

    @Test
    void testToChars() {
        MyString2 myString2 = new MyString2("TaEscrito");
        char[] charResult = {'T','a','E','s','c','r','i','t','o'};
        assertArrayEquals(charResult , myString2.toChars());
    }

    @Test
    void testValueOf() {
        MyString2 myString2 = MyString2.valueOf(true);
        assertEquals("true", myString2.string);
    }
}
