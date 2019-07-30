package AddingTwoMatrices;

import java.util.Scanner;

public class AddingMatrices {
  public static void main(String[] args) {
    AddingMatrices addingMatrices = new AddingMatrices();
    addingMatrices.add();

  }

  public void add(){
    int row, col, i, j;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns of a matrix: ");
    row = sc.nextInt();
    col  = sc.nextInt();

    int first[][] = new int[row][col];
    int second[][] = new int[row][col];
    int sum[][] = new int[row][col];

    System.out.println("Enter elements of first matrix");

    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        first[i][j] = sc.nextInt();

    System.out.println("Enter elements of second matrix");

    for (i = 0 ; i < row ; i++)
      for (j = 0 ; j < col ; j++)
        second[i][j] = sc.nextInt();

    for (i = 0; i < row; i++)
      for (j = 0; j < col; j++)
        sum[i][j] = first[i][j] + second[i][j];

    System.out.println("The Sum of the matrices is::");

    for (i = 0; i < row; i++)
    {
      for ( j= 0; j < col; j++)
        System.out.print(sum[i][j]+"\t");

      System.out.println();
    }
  }
}
