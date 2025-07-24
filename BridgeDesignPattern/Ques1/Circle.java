package BridgeDesignPattern.Ques1;

public class Circle extends Shape{
    
    public Circle(Renderer renderer){
        super(renderer);
    }

    public void draw(){
        super.renderer.render();
    }
}