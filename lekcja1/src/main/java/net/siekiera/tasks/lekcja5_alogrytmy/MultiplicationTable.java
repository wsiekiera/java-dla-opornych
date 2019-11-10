package net.siekiera.tasks.lekcja5_alogrytmy;

import static net.siekiera.tasks.lekcja5_alogrytmy.Utilities.makeNewRow;

public class MultiplicationTable {
    public String generateMultiplicationTable(int edgeSize) {
        //todo implement me!
        StringBuilder multiplicationTable = new StringBuilder();
        for (int row = 1; row <= edgeSize; row++) {
            for (int col = 1; col <= edgeSize; col++) {
                multiplicationTable.append(row * col);
            }
            if (row != edgeSize) makeNewRow(multiplicationTable);
        }
        return multiplicationTable.toString();
    }

    public static void main(String[] args) {
        for (int i = -1; i <= 10; i++) {
            System.out.println("For: " + i + ":");
            System.out.println(new MultiplicationTable().generateMultiplicationTable(i) + "\n");
        }
    }
}
