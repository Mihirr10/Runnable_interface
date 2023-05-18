import com.runnable.CodingTest;
import com.runnable.HR;
import com.runnable.Technical;
import com.runnable.Test;

public class Main {


  public static void main(String[] args) throws InterruptedException {


    System.out.println("Welcome to the Simform Hiring Process");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    Test test = new Test();
    CodingTest codingTest = new CodingTest();
    Technical technical = new Technical();
    HR hr = new HR();


    Thread thread1 = new Thread(test);
    Thread thread2 = new Thread(codingTest);
    Thread thread3 = new Thread(technical);
    Thread thread4 = new Thread(hr);


    thread1.start();
    ;
    thread1.join();
    thread2.start();
    thread2.join();
    thread3.start();
    thread3.join();
    thread4.start();
    thread4.join();

    System.out.println("Congratulations You are selected in Simform !!");


  }
}