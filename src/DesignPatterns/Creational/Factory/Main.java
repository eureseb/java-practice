package DesignPatterns.Creational.Factory;

public class Main {
  public static void main(String[] args) {
    Notification notification = NotificationFactory.createNotification("sms");

    notification.send("Good day peepz");

    notification = NotificationFactory.createNotification("email");

    notification.send("You're fired!");

    notification = NotificationFactory.createNotification("push");

    notification.send("Eurese has been fired! :(");
  }
}
