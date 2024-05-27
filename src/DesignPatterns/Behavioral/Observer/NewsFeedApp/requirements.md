### Problem Statement

You are tasked with developing a News Feed application that tracks and distributes news articles from various sources. The application should notify multiple types of subscribers (e.g., mobile apps, web portals, and email newsletters) whenever a new article is published.

### Requirements

1.  **News Source Management**: The application should be able to manage multiple news sources, each capable of publishing articles.
2.  **Subscription Management**: Subscribers should be able to subscribe to updates from specific news sources. They should also be able to unsubscribe if they no longer wish to receive updates.
3.  **Article Updates**: Whenever a new article is published, the application should notify all subscribed clients with the new article details.
4.  **Subscriber Types**: The application should support multiple types of subscribers:
    *   **Mobile App**: These subscribers should receive notifications about new articles.
    *   **Web Portal**: These subscribers should receive the full article content.
    *   **Email Newsletter**: These subscribers should receive the article title and a brief summary.

### Objectives

1.  **Implement the Observer Pattern**: Use the Observer Pattern to design the system where the news source acts as the subject and the subscribers act as observers.
2.  **Decouple Components**: Ensure that the system is designed in a way that allows for easy addition of new types of subscribers without modifying existing code.
3.  **Real-Time Updates**: Ensure that article updates are propagated to all subscribed clients in real-time.
4.  **Testability**: Design the system to be easily testable, allowing for unit tests to verify the functionality of the observer pattern implementation.