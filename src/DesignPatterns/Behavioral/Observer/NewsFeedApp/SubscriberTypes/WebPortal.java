package DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes;

import DesignPatterns.Behavioral.Observer.NewsFeedApp.Observer;

public class WebPortal implements Observer {
  public WebPortal() {
  }

  @Override
  public void update(String name, String content) {
    System.out.println("====== News Article Just Published ======");
    System.out.println("TITLE : " + name);
    System.out.println("==================");
    System.out.println("CONTENT : " + content);
  }
}
