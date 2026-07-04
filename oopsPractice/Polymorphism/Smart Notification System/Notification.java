package Smart Notification System;

public class Notification {

    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}