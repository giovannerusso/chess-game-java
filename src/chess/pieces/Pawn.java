package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE) { //Cor Branca
            p.setValues(position.getRow() - 1, position.getColumn()); //Acima do peão branco
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //Posição existe e não há uma peça
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() - 2, position.getColumn()); //Primeiro movimento, duas casas Acima do Peão Branco
            Position p2 = new Position(position.getRow() - 1, position.getColumn());
            //Teste para verificar além das condições acima, se há uma outra peça no caminho e se é o primeiro movimento do Peão para ele andar 2 casas
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColumn() - 1); //Diagonal superior esquerda
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColumn() + 1); //Diagonal superior direita
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
        }
        else { //Cor Preta
            p.setValues(position.getRow() + 1, position.getColumn()); //Abaixo do peão preto
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //Posição existe e não há uma peça
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() + 2, position.getColumn()); //Primeiro movimento, duas casas Acima do Peão Branco
            Position p2 = new Position(position.getRow() + 1, position.getColumn());
            //Teste para verificar além das condições acima, se há uma outra peça no caminho e se é o primeiro movimento do Peão para ele andar 2 casas
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColumn() - 1); //Diagonal inferior esquerda
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColumn() + 1); //Diagonal inferior direita
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
        }
        return mat;
    }

    @Override
    public String toString() {
        return "P";
    }
}
