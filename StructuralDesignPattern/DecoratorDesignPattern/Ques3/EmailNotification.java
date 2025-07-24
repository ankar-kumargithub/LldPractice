package DecoratorDesignPattern.Ques3;

public class EmailNotification extends NotificationDecorator{
    public EmailNotification(Notification notification){
        super(notification);
    }
    @Override
    public String sendMessage(){
        return super.sendMessage() + " and Email Notification";
    }
}
