package DesignPatterns.Behavioral.Observer.NewsFeedApp;

public interface Subject {
  void subscribe(Observer observer);
  void unsubscribe(Observer observer);
  void notifyObservers();

}
