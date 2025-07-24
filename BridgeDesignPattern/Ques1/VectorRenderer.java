package BridgeDesignPattern.Ques1;

public class VectorRenderer implements Renderer{
    @Override
    public void render(String shapeType){
        System.out.println("Drawing " + shapeType + " using Vector rendering.");
    }
}