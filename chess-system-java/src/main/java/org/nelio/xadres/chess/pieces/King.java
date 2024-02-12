package org.nelio.xadres.chess.pieces;

import org.nelio.xadres.boardgame.Board;
import org.nelio.xadres.chess.ChessPiece;
import org.nelio.xadres.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
