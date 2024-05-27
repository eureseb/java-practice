package DesignPatterns.Behavioral.Observer.StockMarketApp;

public interface Stock{

  void addObserver(MarketObserver observer);

  void removeObserver(MarketObserver observer);

  void notifyObserver();
}
