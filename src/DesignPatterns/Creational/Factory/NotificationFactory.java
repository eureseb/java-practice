package DesignPatterns.Creational.Factory;

public class NotificationFactory {
  public static Notification createNotification(String type){
    if(type == null || type.isEmpty()){
      return null;
    }
    Notification notification = null;

    switch (type){
      case "email" -> notification = new Email();
      case "push"  -> notification =  new Push();
      case "sms"   -> notification = new SMS();
    }

    return notification;
  }
}
