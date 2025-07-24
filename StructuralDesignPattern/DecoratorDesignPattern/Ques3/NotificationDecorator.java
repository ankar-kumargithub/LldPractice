package DecoratorDesignPattern.Ques3;

public abstract class NotificationDecorator implements Notification{
    protected Notification notification;
    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }
    @Override
    public String sendMessage(){
        return notification.sendMessage();
    }
}
