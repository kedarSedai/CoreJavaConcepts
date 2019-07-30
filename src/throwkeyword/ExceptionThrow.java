package throwkeyword;

public class ExceptionThrow {
  static void run() {
    try {
      throw new NullPointerException("any");
    } catch (NullPointerException e) {
      System.out.println("Exception caught inside fun() method");
    }
  }

  public static void main(String[] args) {
    try {
      run();
    } catch (NullPointerException e) {
      System.out.println("Caught in main");
    }
  }
}
