package FacadeDesignPattern.Ques1;

public class Amplifier extends TheatreSystems {
    private int volume;

    @Override
    public void start() {
        System.out.println("Amplifier started!");
    }

    @Override
    public void stop() {
        System.out.println("Amplifier stopped!");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier volume set to " + this.volume);
    }
}
