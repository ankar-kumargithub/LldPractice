package AdapterDesignPattern.Ques3;

public class PlayerLibrary {

    public void playVlc(String fileName){
        System.out.println(fileName + " played on VLC.");
    }

    public void playMp4(String fileName){
        System.out.println(fileName + " played on mp4.");
    }

}
