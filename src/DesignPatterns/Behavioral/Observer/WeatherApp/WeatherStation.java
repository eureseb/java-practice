package DesignPatterns.Behavioral.Observer.WeatherApp;

import DesignPatterns.Behavioral.Observer.Observer;
import DesignPatterns.Behavioral.Observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
  private List<Observer> observerList;
  private float temperature;
  public WeatherStation(){
    observerList = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObserver() {
    for(Observer observer : observerList) {
      observer.update(temperature);
    }
  }
  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }
}
