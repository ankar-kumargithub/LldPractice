package FacadeDesignPattern.Ques1;

public class Projector extends TheatreSystems{
    
    @Override
    public void start() {
        System.out.println("Projector started!");
    }

    @Override
    public void stop() {
        System.out.println("Projector stopped!");
    }

    public void setInput(TheatreSystems device) {
       System.out.println("Setting projector input to " + device);
    }
}
