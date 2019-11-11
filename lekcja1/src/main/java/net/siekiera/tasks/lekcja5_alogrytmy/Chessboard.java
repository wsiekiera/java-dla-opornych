package net.siekiera.tasks.lekcja5_alogrytmy;

import static net.siekiera.tasks.lekcja5_alogrytmy.Utilities.makeNewRow;

/**
 * Your task is to return a String with chessborad. Chessboard contains of black and white fields. White fields
 * are marked with W and black fields are marked with B. Chessboard always starts with White field (top left).
 *
 * Examples:
 * edgeSize=2
 * WB
 * BW
 *
 * edgeSize=4
 * WBWB
 * BWBW
 * WBWB
 * BWBW
 *
 * edgeSize=6
 * WBWBWB
 * BWBWBW
 * WBWBWB
 * BWBWBW
 * WBWBWB
 * BWBWBW
 *
 */
public class Chessboard {
    private char[] fields = {'W', 'B'};
    public String generateChessboard(int edgeSize) {
        //todo implement me!
        StringBuilder chessboard = new StringBuilder();

        for (int row = 1; row <= edgeSize; row++) {
            for (int col = 1; col <= edgeSize; col++) {
                if ((row+col)%2 == 0) makeWhiteField(chessboard);
                else makeBlackField(chessboard);
            }
            if (row != edgeSize) makeNewRow(chessboard);
        }
        return chessboard.toString();
    }

    private void makeWhiteField(StringBuilder field) {
        field.append(this.fields[0]);
    }

    private void makeBlackField(StringBuilder field) {
        field.append(this.fields[1]);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) System.out.println(new Chessboard().generateChessboard(i) + "\n");
    }
}
