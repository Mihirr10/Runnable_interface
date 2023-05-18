package com.runnable;

public class Technical implements Runnable {

  @Override
  public void run() {
    System.out.println("Technical Round  Started");
    System.out.println("Congratulations you have cleared the technical round ");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }


  }
}

