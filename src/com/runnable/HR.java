package com.runnable;

public class HR implements Runnable{
  @Override
  public void run() {
    System.out.println("HR Round Started");
    System.out.println("Congratulations you have cleared all the rounds ");

    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException e){
      throw new RuntimeException(e);
    }


  }
  }

