package test_package;

import MyStringBuilder1.MyStringBuilder1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testMyStringBuilder {

    @Test
    void testAppend() {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("Hello");
        MyStringBuilder1 result = myStringBuilder1.append(new MyStringBuilder1("Alex"));
        assertEquals("HelloAlex", result.toString());
    }

    @Test
    void testAppendInt () {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("Hello");
        myStringBuilder1.append(2002);
        assertEquals("Hello2002", myStringBuilder1.toString());
    }

    @Test
    void charAtTestValid() {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("Hello");
        char c = myStringBuilder1.charAt(3);
        assertEquals('l', c);
    }

    @Test
    void charAtTestUnvalid() {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("Hello");
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {myStringBuilder1.charAt(10);});
        assertEquals("There's no element in that position", exception.getMessage());
    }

    @Test
    void toLowerCaseTest() {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("HeLLo");
        MyStringBuilder1 lowerCase = myStringBuilder1.toLowerCase();
        assertEquals("hello", lowerCase.toString());
    }

    @Test
    void substringTest() {
        MyStringBuilder1 myStringBuilder1= new MyStringBuilder1("HelloAlex");
        MyStringBuilder1 substring = myStringBuilder1.substring(2, 5);
        assertEquals("lloA", substring.toString());
    }

}
