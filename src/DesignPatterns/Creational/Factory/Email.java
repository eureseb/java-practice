package DesignPatterns.Creational.Factory;

public class Email implements Notification{
  public void send(String message){
    System.out.println("EMAIL NOTIFICATION : " + message);;
  }
}
