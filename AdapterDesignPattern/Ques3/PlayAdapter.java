package AdapterDesignPattern.Ques3;

public class PlayAdapter implements Play{

    private PlayerLibrary playerLibrary;

    PlayAdapter(PlayerLibrary playerLibrary){
        this.playerLibrary = playerLibrary;
    }

    @Override
    public void play(String fileName, String player){
        switch (player) {
            case "MP4":
                playerLibrary.playMp4(fileName);
                break;
            case "VLC":
                playerLibrary.playVlc(fileName);
                break;
            default:
                 System.out.println("Unsupported format: " + player);
                break;
        }
    }

}
