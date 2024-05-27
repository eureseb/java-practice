package DesignPatterns.Creational.Singleton;

import java.lang.reflect.Method;
import java.security.spec.ECField;

public class Main {
  public static void main(String[] args) {
    testSingletonThreadSafety(Logger.class);
    testSingletonThreadSafety(ThreadsafeLogger.class);
  }

  public static <T extends SingletonLogger> void testSingletonThreadSafety(Class<T> singletonClass){
    final int THREAD_COUNT = 100;

    final SingletonLogger[] instances = new SingletonLogger[THREAD_COUNT];

    Runnable task = () -> {
      try{
        Method getInstanceMethod = singletonClass.getDeclaredMethod("getInstance");
        SingletonLogger instance = (SingletonLogger) getInstanceMethod.invoke(null);
        int threadIndex = (int) Thread.currentThread().getId() % THREAD_COUNT;
        instances[threadIndex] = instance;
      }
      catch (Exception e){
        e.printStackTrace();
      }
    };

    Thread[] threads = new Thread[THREAD_COUNT];;
    for(int i = 0; i < THREAD_COUNT; i++){
      threads[i] = new Thread(task);
      threads[i].start();
    }

    for(int i = 0; i < THREAD_COUNT; i++){
      try{
        threads[i].join();
      }
      catch (InterruptedException e){
        e.printStackTrace();
      }
    }

    SingletonLogger firstInstance = instances[0];
    boolean allSame = true;
    for(int i = 0; i < THREAD_COUNT; i++){
      if(instances[i] != firstInstance){
        allSame = false;
        break;
      }
    }

    if(allSame){
      System.out.println("Singleton is thread-safe. All instances are the same");
    }
    else {
      System.out.println("Singleton is NOT thread-safe. Instances are different");
    }
  }
}
