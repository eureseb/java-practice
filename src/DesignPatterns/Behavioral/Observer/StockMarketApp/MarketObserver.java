package DesignPatterns.Behavioral.Observer.StockMarketApp;

public interface MarketObserver{
  void update(Ticker ticker, double price);
}
