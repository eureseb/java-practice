package DesignPatterns.Behavioral.Observer.WeatherApp;

import DesignPatterns.Behavioral.Observer.Observer;

public class TemperatureDisplay implements Observer {
  private float temperature;

  @Override
  public void update(float temperature) {
    this.temperature = temperature;
    display();
  }

  public void display(){
    System.out.println("Current temperature " + temperature + "°C");
  }
}
