package swapWithoutUsingTemp;

import java.util.Scanner;

public class SwapWithoutTemp {
  public static void main(String[] args) {

    int a,b;

    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER a number for a ");
    a = sc.nextInt();

    System.out.println("Enter a number for b ");
    b = sc.nextInt();

    System.out.println("Before Swapping number in a is: " +a);
    System.out.println("Before Swapping number in b is: " +b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Number after Swapping in a is : " + a);
    System.out.println("Number after Swapping in b is  : " + b);
  }
}
