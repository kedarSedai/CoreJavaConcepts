package DoWhile;

public class DoWhileLoop {
  public static void main(String[] args) {

    /*
      do-while loop executes atleast onece even though the condition is false
      Because loop already runs before the condition is check
     */
    int i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 10);
  }
}
