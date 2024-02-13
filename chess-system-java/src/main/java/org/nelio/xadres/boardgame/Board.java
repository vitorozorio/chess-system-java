package org.nelio.xadres.boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows <1 || columns <1) {
            throw new BorderExeption("Erro ao Criar o tabuleiro: É nescessario que ajá ao menos 1 linha e uma coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if(!positianExists(row, column)){
            throw new BorderExeption("position not on the board");
        }
         return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!positianExists(position)){
            throw new BorderExeption("position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BorderExeption("there is already a piece on position " + position );
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positianExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positianExists(Position position){
        return positianExists(position.getRow(),position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if(!positianExists(position)){
            throw new BorderExeption("position not on the board");
        }
        return piece(position) != null;
    }

}
