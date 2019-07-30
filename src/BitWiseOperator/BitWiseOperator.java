package BitWiseOperator;
//Program to swap a two number using bit-wise Operator
public class BitWiseOperator {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;

    System.out.println("the number in A is: " + a);
    System.out.println("the number in B is: " + b);
    // ^ Bit-wise XOR Operator
    a = a ^ b;
    /*
        here a = 2 ^ 5
        Xor of 2 and 5 is: 111 that is 7
        so a is now assigned to 7
    */
    b = a ^ b;
    /*
        now b = 5 and a is now 7
        and xor of 7 and 5 is: 010 that is : 2
        so now b is assigned to 2
     */
    a = a ^ b;
    /*
        value of a is 7 ie 111
        value of b is 2 ie 010
        so now a is assigned to 5 ie 101
        now the number is swapped
     */
    System.out.println("After Swapping");
    System.out.println("Number after swapping in A is: " + a);
    System.out.println("Number after swapping in B is: " + b);

  }
}
