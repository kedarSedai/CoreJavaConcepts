package Finally;

public class FinallyKeyword {
  public static void main(String[] args) {

//    Java finally block
//    Java finally block is a block that is used to execute important code such as closing connection, stream etc.
    try {
      int num = 20 / 10;
      System.out.println(num);
    } catch (NullPointerException e) {
      System.out.println(e);
    } finally {
      System.out.println("finally block is always executed");
    }
  }
}
