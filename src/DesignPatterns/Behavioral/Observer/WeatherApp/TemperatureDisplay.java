package DesignPatterns.Behavioral.Observer.WeatherApp;

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
