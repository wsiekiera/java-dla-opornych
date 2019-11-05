package net.siekiera.tasks;

import net.siekiera.tasks.lekcja1.WordSmasher;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSmasherTest {

    @Test
    public void someWords() {
        assertEquals("abc def", WordSmasher.smash(new String[]{"abc", "def"}));
    }

    @Test
    public void emptyArray() {
        assertEquals("", WordSmasher.smash(new String[]{}));
    }


    @Test
    public void singleWord() {
        assertEquals("abcdef", WordSmasher.smash(new String[]{"abcdef"}));
    }

}