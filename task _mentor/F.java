// Q4. Write a Java program to integral quotient and remainder of a division

import java.util.Scanner;


public class F {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
       System.out.println("Enter a denominator :");
       int n=kb.nextInt();
       System.out.println("Enter a denominaror:");
       int d=kb.nextInt();
      int q=n/d;
      int r=n%d;
      System.out.println("quotient:"+q);
      System.out.println("Remainder:"+r);
    }
}
