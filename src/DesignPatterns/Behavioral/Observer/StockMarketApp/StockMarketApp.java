package DesignPatterns.Behavioral.Observer.StockMarketApp;

public class StockMarketApp {
  public static void main(String[] args) {
    StockMarket apple = new StockMarket(Ticker.AAPL);

    MarketObserver john = new StockEnthusiast("John Doe");
    MarketObserver jane = new StockEnthusiast("Plain Jane");
    MarketObserver aData  = new AnalyticsService("Adata Finance");

    apple.addObserver(john);
    apple.addObserver(jane);
    apple.addObserver(aData);

    apple.setPrice(150);
    apple.setPrice(149);
    apple.setPrice(148);
    apple.setPrice(150);
    apple.setPrice(152);

  }
}
