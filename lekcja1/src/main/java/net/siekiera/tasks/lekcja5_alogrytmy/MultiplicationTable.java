package net.siekiera.tasks.lekcja5_alogrytmy;


public class MultiplicationTable {
    public String generateMultiplicationTable(int edgeSize) {
        String table = "";
        for (int i = 1; i < edgeSize + 1; i++) {
            String line = "";
            for (int j = 1; j < edgeSize + 1; j++) {
                line += i * j;
            }
            table += line;
            if (i != edgeSize) {
                table += "\n";
            }
        }
        return table;
    }
}
