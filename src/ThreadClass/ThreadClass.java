package ThreadClass;

public class ThreadClass extends Thread {
  public void run() {
    try {
      System.out.println("Thread  " + Thread.currentThread().getId() + " is running");


    } catch (Exception e) {
      System.out.println("Exception is caught");
    }
  }

  public static void main(String[] args) {

      ThreadClass tc = new ThreadClass();
      tc.start();

  }

}
