package FlyweightDesignPattern.Ques2;

import java.util.*;

public class ChessBoard {
    private List<Piece> pieces = new ArrayList<>();

    public void addPiece(int x, int y, String name, String color) {
        PieceType type = PieceFactory.getPieceType(name, color);
        Piece piece = new Piece(x, y, type);
        pieces.add(piece);
    }

    public void render() {
        for (Piece piece : pieces) {
            piece.render();
        }
    }
}
