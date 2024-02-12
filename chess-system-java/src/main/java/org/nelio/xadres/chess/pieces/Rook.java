package org.nelio.xadres.chess.pieces;

import org.nelio.xadres.boardgame.Board;
import org.nelio.xadres.chess.ChessPiece;
import org.nelio.xadres.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
