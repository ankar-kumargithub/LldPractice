package DecoratorDesignPattern.Ques3;

public class Main {
    public static void main(String[] args) {
        Notification notification = new BaseNotification();
        System.out.println(notification.sendMessage());
        Notification emailNotification = new EmailNotification(notification);
        System.out.println(emailNotification.sendMessage());
        
    }
}
