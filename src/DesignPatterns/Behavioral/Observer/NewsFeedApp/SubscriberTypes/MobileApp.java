package DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes;

import DesignPatterns.Behavioral.Observer.NewsFeedApp.Observer;

public class MobileApp implements Observer {


  public MobileApp() {
  }

  @Override
  public void update(String name, String content) {
    System.out.println("===== NOTIFICATION =====");
    System.out.println("A new " + name.toUpperCase()  + " article has been published");
  }
}
