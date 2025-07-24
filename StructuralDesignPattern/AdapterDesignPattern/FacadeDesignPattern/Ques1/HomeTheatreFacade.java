package FacadeDesignPattern.Ques1;

public class HomeTheatreFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;

    public HomeTheatreFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movieName){
        amplifier.start();
        amplifier.setVolume(5);
        projector.start();
        projector.setInput(dvdPlayer);
        dvdPlayer.start();
        dvdPlayer.play(movieName);
    }

    public void endMovie(){
        System.out.println("Stopping movie and shutting down home theater");
        dvdPlayer.stop();
        projector.stop();
        amplifier.stop();
    }
}
