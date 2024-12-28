package _10_23_;

import com.sun.source.tree.NewArrayTree;

public class MyString2 {

    public String string = "";

    public MyString2(){
    }

    public MyString2(String s) {
        string = s;
    }

    public MyString2 substring(int begin) {
        MyString2 newString = new MyString2();
        newString.string = "";
        for (int i=begin; i<=string.length(); i++) {
            newString.string += this.string.charAt(i-1);
        }
        return newString;
    }


    public MyString2 toUpperCase() {
        String upperString = "";
        for (int i = 0; i < this.string.length(); i++) {
            char actualChar = this.string.charAt(i);
            if (actualChar >= 'a' && actualChar <= 'z') {
                char upperChar = (char) (actualChar - 32);
                upperString += upperChar;
            } else {
                upperString += actualChar;
            }
        }
        MyString2 newString = new MyString2();
        newString.string = upperString;
        return newString;
    }

    public char[] toChars() {
        char[] charList = new char[this.string.length()];
        for (int i = 0; i < this.string.length(); i++) {
            charList[i] = this.string.charAt(i);
        }
        return charList;
    }

    public static MyString2 valueOf(boolean b) {
        String stringToLoad;
        if (b) {
            stringToLoad = "true";
        } else {
            stringToLoad = "false";
        }
        return new MyString2(stringToLoad);
        //
    }
}
