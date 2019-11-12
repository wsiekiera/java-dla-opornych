package net.jaron.codewars;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char chr : str.toLowerCase().toCharArray()) {
            for (char vowel : vowels) {
                if (chr == vowel) {
                    vowelsCount++;
                    break;
                }
            }
        }
        return vowelsCount;
    }

    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    } // świr...

    public static void main(String[] args) {
        System.out.println(getCount("Abracadabra"));
        System.out.println(getCount2("Abracadabra"));
    }
}