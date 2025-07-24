package AdapterDesignPattern.Ques3;

public class Main {
    public static void main(String[] args) {
        Play play = new PlayAdapter(new PlayerLibrary());
        play.play("Something", "MP4");
        play.play("Something1", "VLC");
    }
}
