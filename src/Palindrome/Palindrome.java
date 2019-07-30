package Palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
  public static void main(String[] args) {
    String rString = "";

    System.out.println("Enter String: ");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();

    Stack stack = new Stack();

    for (int i = 0; i < inputString.length(); i++) {
      stack.push(inputString.charAt(i));
    }

    while (!stack.isEmpty()) {
      rString = rString + stack.pop();

    }

    if (inputString.equals(rString)) {
      System.out.println(inputString + " is Palindrome");
    } else {
      System.out.println(inputString + " is not Palindrome");
    }

  }
}
