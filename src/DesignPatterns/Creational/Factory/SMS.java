package DesignPatterns.Creational.Factory;

public class SMS implements Notification{
  public void send(String message){
    System.out.println("SMS NOTIFICATION : " + message);;
  }
}
