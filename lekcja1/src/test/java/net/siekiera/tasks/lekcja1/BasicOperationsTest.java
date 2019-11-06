package net.siekiera.tasks.lekcja1;

import net.siekiera.tasks.lekcja1.BasicOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicOperationsTest {

    @Test
    public void addingTests() {
        assertEquals(5, BasicOperations.basicMath("+", 2, 3));
    }

    @Test
    public void subtractingTests() {
        assertEquals(8, BasicOperations.basicMath("-", 10, 2));
        assertEquals(-8, BasicOperations.basicMath("-", 2, 10));
    }

    @Test
    public void multiplicationTests() {
        assertEquals(6, BasicOperations.basicMath("*", 2, 3));
        assertEquals(0, BasicOperations.basicMath("*", 0, 3));
    }

    @Test
    public void dividingTests() {
        assertEquals(5, BasicOperations.basicMath("/", 10, 2));
    }
}