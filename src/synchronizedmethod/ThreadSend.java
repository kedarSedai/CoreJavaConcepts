package synchronizedmethod;

public class ThreadSend extends Thread {
  private String msg;
  private Thread thread;
  Sender sender;

  public ThreadSend(String msg, Sender sen) {
    this.msg = msg;
    this.sender = sen;
  }

  public void run() {
    synchronized (sender){
      sender.send(msg);
    }
  }
}
