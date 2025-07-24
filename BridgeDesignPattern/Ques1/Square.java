package BridgeDesignPattern.Ques1;

public class Square extends Shape{
    
    public Square(Renderer renderer){
        super(renderer);
    }

    public void draw(){
        super.renderer.render();
    }
}