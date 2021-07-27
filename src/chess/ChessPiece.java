package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() { //A cor de uma peça só pode ser acessada, e não modificada
        return color;
    }
}
