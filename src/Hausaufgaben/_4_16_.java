package Hausaufgaben;

public class _4_16_ {
    public static void main(String[] args) {
        int s = (int) (Math.random() * (27 + 1));

        char[] alphabet = new char[26];
        for(int i=0; i<26; i++){
            alphabet[i] = (char) ('A' + i);
        }

        System.out.print("Your random letter is: " + alphabet[s]);
    }
}
