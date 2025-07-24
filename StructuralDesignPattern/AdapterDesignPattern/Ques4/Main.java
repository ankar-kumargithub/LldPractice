package AdapterDesignPattern.Ques4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new ShapeAdapter(new LegacyCircle());
        shape.draw();
    }
}
