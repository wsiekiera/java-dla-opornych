package net.siekiera.tasks.lekcja1;

public class WordSmasher {
    public static void main(String[] args) {
        System.out.println(smash("abc", "def", "ghi"));
    }

    public static String smash(String... words) {
        String output = "";
        // TODO Write your code below this comment please
        int i = 1;
        for (String word : words) {
            output += word;
            if (i != words.length) output += " ";
            i++;
        }

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
