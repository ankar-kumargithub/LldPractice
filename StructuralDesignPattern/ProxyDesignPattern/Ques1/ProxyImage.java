package ProxyDesignPattern.Ques1;

public class ProxyImage implements ImageInterface{

    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        if(realImage == null){
            realImage = new Image(fileName);
        }
        realImage.display();
    }
}
