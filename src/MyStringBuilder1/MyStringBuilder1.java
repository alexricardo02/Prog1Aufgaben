package MyStringBuilder1;

public class MyStringBuilder1 {

    char[] stringBuilder;
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
        ensureCapacity(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder[i]
        }
    }

    private void ensureCapacity(int requiredCapacity) {
        if ((requiredCapacity + length) > stringBuilder.length) {
            int newCapacity = stringBuilder.length + requiredCapacity;
            stringBuilder = java.util.Arrays.copyOf(stringBuilder, newCapacity);
        }
    }

    public MyStringBuilder1 append(int i){}
    public int length(){}
    public char charAt(int index){}
    public MyStringBuilder1 toLowerCase(){}
    public MyStringBuilder1 substring(int begin, int end){}
    public String toString(){}
}
