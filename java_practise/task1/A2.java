/*Q2. A Composite Magic number is a positive integer which is composite as well as a magic number.

Composite number: A composite number is a number which has more than two factors.
For example:
Factors of 10 are: 1, 2, 5, 10

Magic number: A Magic number is a number in which the eventual sum of the digit is equal to 1.
For example: 28 = 2+8=10= 1+0=1

Accept two positive integers 'm' and 'n', where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below:

Sample Input:
m=10 n=100
Output: The composite magic numbers are 10,28,46,55,64,82,91,100
Frequency of composite magic numbers: 8

Sample Input:
m=120 n=90
Output: Invalid input*/
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int last,sum=0,i,count=0;
        System.out.println("enter any n");
        int n=sk.nextInt();
        for( i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("composite no :"+i);
            } 
        
        if(i>9){
        for(int j=9;j<=i;){
       
          last=i%10;
          sum=sum+last;
        
        i=i/10;
   
        System.out.println("sum of greater than 2 digits :"+sum);
    }
}
    }
}
}
