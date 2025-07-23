package ProxyDesignPattern.Ques1;

public class Main {
    public static void main(String args[]){
        ImageInterface image = new ProxyImage("test_file.jpg");
        image.display();
        image.display();
    }
}
