package org.nelio.xadres.application;

import org.nelio.xadres.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {


        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.GetPieces());

    }
}