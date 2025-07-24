package FlyweightDesignPattern.Ques1;

public class Main {
    public static void main(String args[]) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "Oak", "Green", "Rough");
        forest.plantTree(3, 4, "Oak", "Green", "Rough");
        forest.plantTree(5, 6, "Pine", "Dark Green", "Smooth");
        forest.plantTree(7, 8, "Pine", "Dark Green", "Smooth");
        forest.plantTree(9, 10, "Birch", "Light Green", "Smooth");

        forest.draw();
    }
}
