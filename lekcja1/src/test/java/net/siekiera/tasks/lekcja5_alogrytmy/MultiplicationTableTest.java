package net.siekiera.tasks.lekcja5_alogrytmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableTest {
    private MultiplicationTable multiplicationTable;
    String table2;
    String table4;
    String table6;

    @Before
    public void prepare() {
        multiplicationTable = new MultiplicationTable();
        table2 = new StringBuilder()
                .append("12\n")
                .append("24")
                .toString();
        table4 = new StringBuilder()
                .append("1234\n")
                .append("2468\n")
                .append("36912\n")
                .append("481216")
                .toString();
        table6 = new StringBuilder()
                .append("123456\n")
                .append("24681012\n")
                .append("369121518\n")
                .append("4812162024\n")
                .append("51015202530\n")
                .append("61218243036")
                .toString();
    }

    @Test
    public void generateMultiplicationTable() {
        assertEquals(table2, multiplicationTable.generateMultiplicationTable(2));
        assertEquals(table4, multiplicationTable.generateMultiplicationTable(4));
        assertEquals(table6, multiplicationTable.generateMultiplicationTable(6));
    }
}