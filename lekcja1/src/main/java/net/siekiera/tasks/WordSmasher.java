package net.siekiera.tasks;

public class WordSmasher {
    public static void main(String[] args) {
        System.out.println(smash("abc", "def", "ghi"));
    }

    public static String smash(String... words) {
        String output = "";
        int arrayLength = words.length;
        for (int i=0; i<arrayLength; i++) {
            output= output + words[i] + " ";
        }
        return output.strip();
    }

}
