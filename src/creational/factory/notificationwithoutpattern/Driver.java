package creational.factory.notificationwithoutpattern;

public class Driver {

    public static void main(String[] args) {

        NotificationAttributes attributes = new NotificationAttributes(
                "9890098900","878787013","Your Mobile OTP : 35654 valid for 10 minus"
        );

        Notification notification = new SMSNotification();

        notification.sendNotification(attributes); // here we are using method from obj of type Notification not of SMSNotification class.
        //so we can access method in the interface only not all method in SMSN class

        attributes = new NotificationAttributes(
                "lava@gmail.com","kumar@gmail.com","Your Service OTP : 35654 valid for 10 minus"
        );

        notification = new EmailNotification();

        notification.sendNotification(attributes);


    }
}
