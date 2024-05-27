package DesignPatterns.Behavioral.Observer.NewsFeedApp.SubscriberTypes;

import DesignPatterns.Behavioral.Observer.NewsFeedApp.Observer;

public class EmailNewsletter implements Observer {

  public EmailNewsletter() {
  }

  @Override
  public void update(String name, String content) {
    System.out.println("====== ARTICLE NEWSLETTER ======");
    System.out.println("Subject: New Article Has Been Published");
    System.out.println("Today's article is about " + name + ".");
    System.out.println(extractFirstSentence(content));
    System.out.println("==================");
  }

  public static String extractFirstSentence(String content) {
    int endIndex = content.indexOf(". ");
    if (endIndex != -1) {
      return content.substring(0, endIndex + 1); // Include the period at the end of the sentence
    } else {
      return content; // Return the whole string if no period is found
    }
  }
}
