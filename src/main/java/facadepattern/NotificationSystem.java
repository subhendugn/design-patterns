package facadepattern;

public class NotificationSystem {
    public void sendNotification(User user) {
        System.out.println("Notification sent to user: " + user.getName());
    }
}
