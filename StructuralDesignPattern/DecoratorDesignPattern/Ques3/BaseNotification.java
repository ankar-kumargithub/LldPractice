package DecoratorDesignPattern.Ques3;

public class BaseNotification implements Notification{
    
    @Override
    public String sendMessage(){
        return "Base send message.";
    }
}
