// Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and
// remainder of two numbers.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("Enter a first no.:");
        int a=op.nextInt();
        System.out.println("Enter a first no.:");
        int b=op.nextInt();
          int c=a+b;
          int d=a-b;
          int e=a*b;
          float f=a/b;
          int g=a%b;
          System.out.println("addition :"+c);
          System.out.println("Subtraction :"+d);
          System.out.println("Multiplication :"+e);
          System.out.println("Divide :"+f);
          System.out.println("mod of :"+g);
    }
    
}
