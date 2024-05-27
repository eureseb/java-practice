# Problem Statement
You are tasked with developing a simple Stock Market application that tracks the prices of various stocks and notifies subscribed clients of any price changes. 
The application should be able to support multiple types of clients, such as individual investors and analytics services, who need to be updated whenever the price of a stock they are interested in changes.

Requirements
- **Stock Management**: The application should be able to manage multiple stocks, each identified by a unique ticker symbol (e.g., AAPL for Apple, GOOGL for Google).
- **Subscription Management**: Clients should be able to subscribe to updates for specific stocks they are interested in. They should also be able to unsubscribe if they no longer wish to receive updates.
- **Price Updates**: Whenever the price of a stock changes, the application should notify all subscribed clients with the new price.
- **Client Types**: The application should support multiple types of clients:
- **Individual Investors**: These clients should simply receive the updated price.
- **Analytics Services**: These clients should receive the updated price along with some additional analysis, such as the percentage change from the previous price.

## Objectives
* Implement the Observer Pattern: Use the Observer Pattern to design the system where the stock acts as the subject and the clients act as observers.
* Decouple Components: Ensure that the system is designed in a way that allows for easy addition of new types of clients without modifying existing code.
* Real-Time Updates: Ensure that price updates are propagated to all subscribed clients in real-time.
* Testability: Design the system to be easily testable, allowing for unit tests to verify the functionality of the observer pattern implementation.

## Implementation Plan
1. Define the Subject Interface: Create an interface for the subject that allows for attaching, detaching, and notifying observers.
2. Define the Observer Interface: Create an interface for observers that defines the update method.
3. Implement Concrete Subject: Implement the Stock class that maintains the list of observers and notifies them of price changes.
4. Implement Concrete Observers: Implement different types of observers (Individual Investor, Analytics Service) that update themselves based on notifications from the Stock.
5. Subscription Management: Implement methods for clients to subscribe and unsubscribe from specific stocks.
6. Price Update Mechanism: Implement the mechanism to update stock prices and notify all subscribed clients.