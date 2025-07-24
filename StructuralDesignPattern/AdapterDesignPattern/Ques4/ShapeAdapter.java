package AdapterDesignPattern.Ques4;

public class ShapeAdapter implements Shape{
    private LegacyCircle legacyCircle;

    public ShapeAdapter(LegacyCircle legacyCircle){
        this.legacyCircle = legacyCircle;
    }
    
    @Override
    public void draw(){
        legacyCircle.drawCircle();
    }
}
