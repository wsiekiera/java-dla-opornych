package net.siekiera.tasks;

import net.siekiera.tasks.lekcja1.GrassHopper;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperTest {
    @Test
    public void grassHopperTestCases() {
        assertEquals(1, GrassHopper.summation(1));
        assertEquals(3, GrassHopper.summation(2));
        assertEquals(36, GrassHopper.summation(8));

    }

}