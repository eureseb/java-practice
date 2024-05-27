package DesignPatterns.Behavioral.Observer.WeatherApp;

public class WeatherStationApp {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

    weatherStation.addObserver(temperatureDisplay);
    weatherStation.addObserver(statisticsDisplay);

    weatherStation.setTemperature(25.3f);
    weatherStation.setTemperature(27.8f);
    weatherStation.setTemperature(23.4f);

    weatherStation.notifyObserver();
  }
}
