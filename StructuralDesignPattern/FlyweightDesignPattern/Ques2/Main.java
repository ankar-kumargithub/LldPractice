package FlyweightDesignPattern.Ques2;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.addPiece(0, 0, "Rook", "Black");
        board.addPiece(0, 7, "Rook", "Black");
        board.addPiece(7, 0, "Rook", "White");
        board.addPiece(7, 7, "Rook", "White");
        board.addPiece(0, 3, "Queen", "Black");
        board.addPiece(7, 3, "Queen", "White");
        board.render();
    }
}
