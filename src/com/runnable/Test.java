package com.runnable;

public class Test implements Runnable {
  @Override
  public void run() {
    System.out.println("Aptitude Round  Started");
    System.out.println("Congratulations you have cleared the Aptitude round ");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }
}

