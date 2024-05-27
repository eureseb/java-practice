package DesignPatterns.Behavioral.Observer.StockMarketApp;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
  List<MarketObserver> observers;
  Ticker ticker;
  double price;

  public StockMarket(Ticker ticker){
    this.ticker = ticker;
    observers = new ArrayList<>();
  }

  @Override
  public void addObserver(MarketObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(MarketObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObserver() {
    for(MarketObserver observer : observers){
      observer.update(ticker, price);
    }
  }

  public void setPrice(double price) {
    this.price = price;
    notifyObserver();
  }
}
