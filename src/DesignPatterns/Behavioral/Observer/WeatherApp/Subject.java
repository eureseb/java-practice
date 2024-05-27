package DesignPatterns.Behavioral.Observer.WeatherApp;

import DesignPatterns.Behavioral.Observer.WeatherApp.Observer;

public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObserver();
}
