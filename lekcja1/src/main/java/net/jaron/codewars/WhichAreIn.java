package net.jaron.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] subs, String[] strings) {
        String stringsInOne = Arrays.toString(strings);
        List<String> result = new ArrayList<>();
        for (String sub : subs) {
            if (stringsInOne.contains(sub)) result.add(sub);
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
        //return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
    }
}