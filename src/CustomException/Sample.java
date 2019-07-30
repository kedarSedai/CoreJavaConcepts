package CustomException;

public class Sample {
  static void compute(int a) throws MyException {
    if (a > 10)
      throw new MyException(a);
    System.out.println(" No exception caught");
  }

  public static void main(String[] args) {
    try {
      compute(5);
      compute(12);
    } catch (MyException ex1) {
      System.out.println(ex1);
    }
  }
}
