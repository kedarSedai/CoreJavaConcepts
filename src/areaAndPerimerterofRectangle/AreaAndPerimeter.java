package areaAndPerimerterofRectangle;

import java.util.Scanner;

public class AreaAndPerimeter {
  double length;
  double breadth;

  public void calculateArea() {
    System.out.println("Enter Length of Rectangle: ");

    Scanner sc = new Scanner(System.in);
    length = sc.nextDouble();

    System.out.println("Enter Breadth of Rectangle: ");

    Scanner sc1 = new Scanner(System.in);
    breadth = sc1.nextDouble();

    double result = length * breadth;

    System.out.println("Area of Rectangle is: " + result);

  }

  public void calculatePerimeter() {
    System.out.println("Enter Length of Rectangle to calculate perimeter: ");

    Scanner scanner = new Scanner(System.in);
    length = scanner.nextDouble();

    System.out.println("Enter Breadth of Rectangle to calculate perimeter: ");

    Scanner scanner1 = new Scanner(System.in);
    breadth = scanner1.nextDouble();

    double result = (2 * length) + (2 * breadth);
    System.out.println("Perimeter of the Rectangle is: " +result);
  }

}
