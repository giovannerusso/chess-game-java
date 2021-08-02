package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() { //A cor de uma peça só pode ser acessada, e não modificada
        return color;
    }

    public ChessPosition getChessPosition() { //Retorna a posição no Tabuleiro
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null & p.getColor() != color; //A cor da peça nessa posição é diferente da cor da peça realizando a jogada
    }
}
