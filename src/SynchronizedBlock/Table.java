package SynchronizedBlock;

public class Table {
  public void printTable(int n) {
    for (int i = 1; i <= 4; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(200);

      } catch (Exception e) {
        System.out.println(e);
      }

    }
  }
}
