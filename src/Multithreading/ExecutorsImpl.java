package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsImpl implements Runnable {
  public static void main(String[] args) {
    ExecutorsImpl obj = new ExecutorsImpl();
      ExecutorService executors = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10000; i++) {
      System.out.println("This is " + i);
      executors.execute(obj);
    }
  }

  @Override
  public void run() {
    System.out.println("Inside run method");
  }
}
