package FacadeDesignPattern.Ques1;

public class DvdPlayer extends TheatreSystems {

    
    @Override
    public void start() {
        System.out.println("DVD player turned on");
    }

    @Override
    public void stop() {
        System.out.println("DVD player turned off");
    }

    public void play(String movieName) {
        System.out.println("DVD player playing movie: " + movieName);
    }
}
