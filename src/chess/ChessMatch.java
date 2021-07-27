package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8); // Dimensionando o tabuleiro de xadrez
    }

    public ChessPiece[][] getPieces() { //Programa só pode enxergar a peça de xadrez
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j); // Downcasting
            }
        }
        return mat; // Retorna a matriz de peças da partida de xadrez
    }
}
