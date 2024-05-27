package DesignPatterns.Behavioral.Observer.NewsFeedApp.NewsSource;

import DesignPatterns.Behavioral.Observer.NewsFeedApp.Observer;
import DesignPatterns.Behavioral.Observer.NewsFeedApp.Subject;
import java.util.ArrayList;
import java.util.List;

public class Article implements Subject {
  private final List<Observer> subscribers;
  private String name;
  private String content;

  public Article(String name, String content) {
    this.subscribers = new ArrayList<>();
    this.name = name;
    this.content = content;
  }

  public Article() {
    subscribers = new ArrayList<>();
  }

  @Override
  public void subscribe(Observer observer) {
    subscribers.add(observer);
  }

  public void subscribe(List<Observer> subscribers){
    this.subscribers.addAll(subscribers);
  }

  @Override
  public void unsubscribe(Observer observer) {
    subscribers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for(Observer sub : subscribers){
      sub.update(name, content);
    }
  }

  public void publish(String name, String content){
    this.name = name;
    this.content = content;
    notifyObservers();
  }
}
