package synchronizedmethod;

public class SyncOut {
  public static void main(String[] args) {
    Sender sender = new Sender();
    ThreadSend th = new ThreadSend("Hi ", sender);
    ThreadSend th1 = new ThreadSend("Hello ", sender);
    th.start();
    th1.start();
    try {
      th.join();
      th1.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
