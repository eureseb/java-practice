package DesignPatterns.Creational.Singleton;

public class Logger implements SingletonLogger {

  private static Logger logger;

  private Logger(){
  }

  public static Logger getInstance(){
    if(logger == null){
      logger = new Logger();
    }
    return logger;
  }
  public void logInfo(String message){
    System.out.println("INFO: " + message);
  }
  public void logError(String error){
    System.err.println("ERROR: " + error);
  }
}
