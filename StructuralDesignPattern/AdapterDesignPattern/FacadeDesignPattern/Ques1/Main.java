package FacadeDesignPattern.Ques1;

public class Main {
    public static void main(String[] args) {
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(new Amplifier(), new DvdPlayer(), new Projector());
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
