package DesignPatterns.Behavioral.Observer.StockMarketApp;

public class StockEnthusiast implements MarketObserver{
  private final String name;

  public StockEnthusiast(String name) {
    this.name = name;
  }

  @Override
  public void update(Ticker ticker, double price) {
    System.out.println("Investor " + name + " notified. " + ticker + " is now $" + price);
  }
}
