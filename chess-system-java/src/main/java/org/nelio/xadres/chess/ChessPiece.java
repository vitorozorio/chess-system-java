package org.nelio.xadres.chess;

import org.nelio.xadres.boardgame.Board;
import org.nelio.xadres.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
