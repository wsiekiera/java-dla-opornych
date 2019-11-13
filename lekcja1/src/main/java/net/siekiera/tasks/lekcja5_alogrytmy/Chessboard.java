package net.siekiera.tasks.lekcja5_alogrytmy;

/**
 * Your task is to return a String with chessborad. Chessboard contains of black and white fields. White fields
 * are marked with W and black fields are marked with B. Chessboard always starts with White field (top left).
 * <p>
 * Examples:
 * edgeSize=2
 * WB
 * BW
 * <p>
 * edgeSize=4
 * WBWB
 * BWBW
 * WBWB
 * BWBW
 * <p>
 * edgeSize=6
 * WBWBWB
 * BWBWBW
 * WBWBWB
 * BWBWBW
 * WBWBWB
 * BWBWBW
 */
public class Chessboard {
    public String generateChessboard(int edgeSize) {
        //todo implement me!
        StringBuilder chessBoard = new StringBuilder();

        String whiteChessField = "W";
        String blackChessField = "B";

        for (int i = 0; i < edgeSize; i++) {
            for (int j = 0; j < edgeSize; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard.append(whiteChessField);
                } else {
                    chessBoard.append(blackChessField);
                }
            }
            chessBoard.append("\n");
        }
        //System.out.println(chessBoard);
        return chessBoard.toString().trim();

    }
}