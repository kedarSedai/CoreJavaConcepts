package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int z =  20/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("can't Divide by zero");
    }
}
