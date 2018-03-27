package net.azma.codewars;

public class Keypad {

    public static int presses(String phrase) {
        int result = 0;
        String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
        phrase = phrase.toUpperCase();
        for (char c : phrase.toCharArray()) {
            for (String s : keys) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==c) {
                        result += (i+1);
                    }
                }
            }

        }
        return result;
    }
}
