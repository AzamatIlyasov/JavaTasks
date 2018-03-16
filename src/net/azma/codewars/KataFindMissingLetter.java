package net.azma.codewars;

public class KataFindMissingLetter {

    public static char findMissingLetter(char[] array)
    {
        char res = ' ';
        for (int i = 1; i < array.length; i++) {
            if ( array[i] != (array[i-1]+1) ) {
                res = (char) (array[i] - 1);
            }
        }
        return res;
    }
}
