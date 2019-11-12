package net.jaron.codewars;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] splittedWords = morseCode.trim().split(" {3}");
        StringBuilder decodedWorld = new StringBuilder();
        for (String word : splittedWords) {
            for (String sign : word.split(" ")) {
                decodedWorld.append(sign);  //append(MorseCode.get(sign));
            }
            decodedWorld.append(" ");
        }
        return decodedWorld.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }
}