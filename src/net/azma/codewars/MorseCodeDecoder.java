package net.azma.codewars;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        morseCode = morseCode.trim();
        String[] arrCodeWords = morseCode.split("   ");
        String result = "";
        for (String word : arrCodeWords) {
            String[] arrCodeLetters = word.split(" ");
            for (String codeLetter : arrCodeLetters) {
                //result += MorseCode.get(codeLetter);
            }
            result += " ";

        }
        result = result.trim();
        return result;

    }
}
