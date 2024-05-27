package DesignPatterns.Behavioral.Observer.NewsFeedApp;

import DesignPatterns.Behavioral.Observer.NewsFeedApp.NewsSource.Article;
import DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes.EmailNewsletter;
import DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes.MobileApp;
import DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes.WebPortal;
import java.util.List;

public class NewsFeedApp {
  public static void main(String[] args) {
    Article myDay = new Article();

    Observer chrome = new WebPortal();
    System.out.println();
    Observer gmail  = new EmailNewsletter();
    System.out.println();
    Observer iphone = new MobileApp();

    myDay.subscribe(List.of(chrome, gmail, iphone));

    myDay.publish("Daily Encounters",
        "Today I got my first salary. I of course went and bought myself Jollibee" +
            "After I got home, I gave doughnuts to my family.");

  }
}
