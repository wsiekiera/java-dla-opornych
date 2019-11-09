package net.siekiera.tasks.lekcja5_alogrytmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessboardTest {
    String chessBoard2;
    String chessBoard4;
    String chessBoard6;
    Chessboard chessboard;

    @Before
    public void prepare() {
        chessboard = new Chessboard();
        chessBoard2 = new StringBuilder()
                .append("WB\n")
                .append("BW")
                .toString();
        chessBoard4 = new StringBuilder()
                .append("WBWB\n")
                .append("BWBW\n")
                .append("WBWB\n")
                .append("BWBW")
                .toString();
        chessBoard6 = new StringBuilder()
                .append("WBWBWB\n")
                .append("BWBWBW\n")
                .append("WBWBWB\n")
                .append("BWBWBW\n")
                .append("WBWBWB\n")
                .append("BWBWBW")
                .toString();


    }
    @Test
    public void generateChessboard() {
        assertEquals(chessBoard2, chessboard.generateChessboard(2));
        assertEquals(chessBoard4, chessboard.generateChessboard(4));
        assertEquals(chessBoard6, chessboard.generateChessboard(6));
    }
}