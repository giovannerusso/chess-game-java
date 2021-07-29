package boardgame;

public abstract class Piece {
    protected Position position; // Não é a posição no tabuleiro, mas na matriz
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Opcional
    }

    protected Board getBoard() { //O tabuleiro só pode ser acessado dentro do pacote e das subclasses de Peças
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
