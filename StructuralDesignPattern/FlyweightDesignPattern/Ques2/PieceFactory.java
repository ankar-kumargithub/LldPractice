package FlyweightDesignPattern.Ques2;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
    private static Map<String, PieceType> pieceMap = new HashMap<>();

    public static PieceType getPieceType(String name, String color) {
        String key = name + '-' + color;
        PieceType type = pieceMap.get(key);
        if (type == null) {
            type = new PieceType(name, color);
            pieceMap.put(key, type);
            System.out.println("Created new PieceType: " + key);
        }
        return type;
    }
}
