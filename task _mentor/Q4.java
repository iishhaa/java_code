//Q5. Write a Java program that takes two numbers as input and displays the product of two
// numbers. 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("Enter a n1 :");
        int n1=op.nextInt();
        System.out.println("enter a n2 :");
        int n2=op.nextInt();
        int c=n1*n2;
        System.out.println("product of two no.:"+c);
    }
}
