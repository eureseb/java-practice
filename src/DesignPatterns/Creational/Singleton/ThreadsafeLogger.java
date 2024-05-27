package DesignPatterns.Creational.Singleton;

public class ThreadsafeLogger implements SingletonLogger{
  private ThreadsafeLogger(){
  }

  public static class ThreadSafeLoggerHolder{
    public static final ThreadsafeLogger INSTANCE = new ThreadsafeLogger();
  }

  public static ThreadsafeLogger getInstance(){
    return ThreadSafeLoggerHolder.INSTANCE;
  }

  public void logInfo(String message){
    System.out.println("INFO: " + message);
  }
  public void logError(String error){
    System.err.println("ERROR: " + error);
  }

}
