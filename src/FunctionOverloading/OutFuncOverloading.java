package FunctionOverloading;

import java.util.Scanner;

public class OutFuncOverloading {
    public static void main(String[] args) {

        FunctionOverloading fo = new FunctionOverloading();

        System.out.println("The sum of Two Number is:" + fo.sum(2, 3));
        System.out.println("The sum of Two Number is:" + fo.sum(2, 3, 4));
    }
}
