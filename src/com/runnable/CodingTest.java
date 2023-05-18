package com.runnable;

public class CodingTest implements Runnable{
  @Override
  public void run() {
    System.out.println("Coding Round Started");
    System.out.println("Congratulations you have cleared the coding round ");

        try {
              Thread.sleep(2000);

        }
        catch (InterruptedException e){
          throw new RuntimeException(e);
        }


  }
}
