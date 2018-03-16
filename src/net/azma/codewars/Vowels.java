package net.azma.codewars;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char[] strLetters = str.toCharArray();
        for (char letter : strLetters) {
            switch (letter) {
                case 'a':
                    vowelsCount++;
                    break;
                case 'e':
                    vowelsCount++;
                    break;
                case 'i':
                    vowelsCount++;
                    break;
                case 'o':
                    vowelsCount++;
                    break;
                case 'u':
                    vowelsCount++;
                    break;
            }
        }

        return vowelsCount;
    }

}