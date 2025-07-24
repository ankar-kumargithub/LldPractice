package BridgeDesignPattern.Ques1;

public class Main{
    public static void main(String[] args){
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer);
        Shape square = new Square(rasterRenderer);

        circle.draw();
        square.draw();
    }
}
