package boardgame;

public class Piece {
    protected Position position; // Não é a posição no tabuleiro, mas na matriz
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Opcional
    }

    protected Board getBoard() { //O tabuleiro só pode ser acessado dentro do pacote e das subclasses de Peças
        return board;
    }
}
