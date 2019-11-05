package net.siekiera.tasks.lekcja1;

public class WordSmasher {
    public static void main(String[] args) {
        System.out.println(smash("abc", "def", "ghi"));
    }

    public static String smash(String... words) {
        String output = "";
        // TODO Write your code below this comment please
        for (String word : words) output += word;
        // czy ze spacjami?



        /*int arrayLength = words.length;
        for (int i=0; i<arrayLength; i++) {
            output= output + words[i];
            if (i!=arrayLength-1) {
                output+=" ";
            }
        }*/
        return output;
    }

}
