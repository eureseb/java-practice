package DesignPatterns.Behavioral.Observer.StockMarketApp;

import java.util.function.ToIntBiFunction;

public class AnalyticsService implements MarketObserver{
  private final String serviceName;
  private double lastPrice;

  public AnalyticsService(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override
  public void update(Ticker ticker, double price) {
    if (lastPrice != 0) {
      double percentageChange = ((price - lastPrice) / lastPrice) * 100;
      System.out.println(serviceName + " notified. " + ticker + " is now $" + price + " (" + percentageChange + "% change)");
    } else {
      System.out.println(serviceName + " notified. " + ticker + " is now $" + price);
    }
    lastPrice = price;
  }

}
