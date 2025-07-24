package BridgeDesignPattern.Ques1;

public class RasterRenderer implements Renderer{
    @Override
    public void render(String shapeType){
        System.out.println("Drawing " + shapeType + " using Raster rendering.");
    }
}