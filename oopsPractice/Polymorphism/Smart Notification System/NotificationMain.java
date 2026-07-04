package Smart Notification System;

public class NotificationMain {

    public static void main(String[] args) {

        Notification[] notifications = {

                new EmailNotification(
                        "Love",
                        "Welcome to our platform"),

                new SMSNotification(
                        "Rahul",
                        "Your OTP is 1234"),

                new PushNotification(
                        "Aman",
                        "You received a new offer")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}