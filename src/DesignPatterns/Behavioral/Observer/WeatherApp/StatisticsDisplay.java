package DesignPatterns.Behavioral.Observer.WeatherApp;

import DesignPatterns.Behavioral.Observer.Observer;

public class StatisticsDisplay implements Observer {
  private float temperature;
  private float maxTemp = Float.MIN_VALUE;
  private float minTemp = Float.MAX_VALUE;
  private float tempSum = 0.0f;
  private int numReadings;
  @Override
  public void update(float temperature) {
    this.temperature = temperature;
    tempSum += temperature;
    numReadings++;

    if(temperature > maxTemp){
      maxTemp = temperature;
    }
    if(temperature < minTemp){
      minTemp = temperature;
    }

    display();
  }

  public void display(){
    System.out.println("Avg/Max/Min Temperature : " + (tempSum/numReadings) + " / " + maxTemp + " / " + minTemp);
  }
}
