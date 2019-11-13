package net.siekiera.tasks.lekcja5_alogrytmy;

public class MultiplicationTable {
    public String generateMultiplicationTable(int edgeSize) {
        //todo implement me!
        StringBuilder multiplicationMatrix = new StringBuilder();

        for (int i = 1; i <= edgeSize; i++) {
            for (int j = 1; j <= edgeSize; j++) {
//                int a = i * j;
//                String wynikChar = String.format("%4d", a);
//                multiplicationMatrix.append(wynikChar);
                multiplicationMatrix.append(i * j);
//                System.out.printf("%4d", i*j);
            }
            multiplicationMatrix.append("\n");
//            System.out.println();
        }
        System.out.println(multiplicationMatrix);
        return multiplicationMatrix.toString().trim();
    }
//        System.out.println(multiplicationMatrix);
//        return multiplicationMatrix.toString().trim();
}
