/*
Q1. A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors. For example:
4, 22, 27, 58, 85, 94, 121 ………. are Smith numbers.

Write a program in Java to enter a number and check whether it is a Smith number or not.

Sample Input: 666
Sum of the digits: 6 + 6 + 6 = 18
Prime factors are: 2, 3, 3, 37
Sum of the digits of the prime factors: 2 + 3 + 3 + (3 + 7) = 18
Thus, 666 is a Smith Number.
*/

import java.util.Scanner;
class A1{
     public static void main(String[]args){
        Scanner sk=new Scanner(System.in);
        int sum=0,i=1;
        System.out.println("enter n :");
        int n=sk.nextInt();
        int temp=n;
        while(i<=temp){
        int last=temp%10;
        sum=sum+last;
     temp=temp/10;
        
        System.out.println(sum);
    for(int j=2;j<=n/2;j++){
         if(n/j==0){
           System.out.println();     
          
            
         }
    }
     }
}
}