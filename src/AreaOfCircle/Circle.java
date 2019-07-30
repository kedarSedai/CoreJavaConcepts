package AreaOfCircle;

import java.util.Scanner;

public class Circle {
  double radius;

  public void calculateRadius() {
    System.out.println("Enter the Radius : ");
    Scanner sc = new Scanner(System.in);
    radius = sc.nextDouble();

    double result = radius * radius * Math.PI;

    System.out.println("Radius of the circle is: " +result);

  }

}
