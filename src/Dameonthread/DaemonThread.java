package Dameonthread;

public class DaemonThread extends Thread {
  public DaemonThread(String name) {
    super(name);
  }

  public void start() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println(getName() + "is Daemon Thread");
    } else {
      System.out.println(getName() + "is User Thread");
    }
  }

  public static void main(String[] args) {
    DaemonThread dt = new DaemonThread("Daemon thread 1");
    DaemonThread dt2 = new DaemonThread("Daemon thread 2");
    dt.setDaemon(true);
    dt.start();
  }
}
