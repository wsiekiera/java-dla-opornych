package net.siekiera.tasks.lekcja5_alogrytmy;

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
    public String generateChessboard(int edgeSize) {
        String oddLine = repeatString("WB", edgeSize / 2);
        String evenLine = repeatString("BW", edgeSize / 2);
        String board = "";
        for(int i = 0; i < edgeSize; i++) {
            if (i == 0 || i % 2 == 0) {
                board += oddLine;
            } else {
                board += evenLine;
            }
            if (i != edgeSize - 1) {
                board += "\n";
            }
        }
        return board;
    }

    public static String repeatString(String str, int times) {
        if (times <= 0) return "";
        else return str + repeatString(str, times-1);
    }
}

