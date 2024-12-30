package MyStringBuilder1;

import _10_23_.MyString2;

public class MyStringBuilder1 {

    public char[] stringBuilder;
    int length;
    int default_length = 16;

    public MyStringBuilder1(String s){
        this.stringBuilder = new char[Math.max(default_length, s.length())];
        this.length = s.length();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder[i] = c;
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        ensureCapacity(s.length);
        for (int i = 0; i < s.length; i++) {
            stringBuilder[length] = s.stringBuilder[i];
            length++;
        }
        return this;
    }

    private void ensureCapacity(int requiredCapacity) {
        if ((requiredCapacity + length) > stringBuilder.length) {
            int newCapacity = stringBuilder.length + requiredCapacity;
            stringBuilder = java.util.Arrays.copyOf(stringBuilder, newCapacity);
        }
    }

    public MyStringBuilder1 append(int i) {
        String c = String.valueOf(i);
        for (int j = 0; j < c.length(); j++) {
            stringBuilder[length] = c.charAt(j);
            length++;
        }
        return this;
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {
        if (index > length) {
            throw new ArrayIndexOutOfBoundsException("There's no element in that position");
        }
        return stringBuilder[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < length; i++) {
            char actualChar = stringBuilder[i];
            if (actualChar >= 'A' && actualChar <= 'Z') {
                char lowerChar = (char) (actualChar + 32);
                stringBuilder[i] = lowerChar;
            }
        }
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String substring = "";
        for (int i = begin; i <= end; i++) {
            substring += this.charAt(i);
        }
        return new MyStringBuilder1(substring);
    }

    @Override
    public String toString() {
        return new String(stringBuilder, 0, length);
    }
}
