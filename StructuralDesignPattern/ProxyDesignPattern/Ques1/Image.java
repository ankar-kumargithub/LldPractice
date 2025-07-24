package ProxyDesignPattern.Ques1;

public class Image implements ImageInterface{
    String fileName;

    public Image(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image: " + fileName);
    }
}
