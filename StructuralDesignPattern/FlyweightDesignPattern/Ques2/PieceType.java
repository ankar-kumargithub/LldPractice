package FlyweightDesignPattern.Ques2;

public class PieceType {
    private String name;
    private String color;

    public PieceType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void render(int x, int y) {
        System.out.println("Rendering piece[" + name + ", " + color + "] at (" + x + ", " + y + ")");
    }
}
