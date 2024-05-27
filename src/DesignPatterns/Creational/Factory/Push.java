package DesignPatterns.Creational.Factory;

public class Push implements Notification{
  public void send(String message){
    System.out.println("PUSH NOTIFICATION : " + message);;
  }
}
