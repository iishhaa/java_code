
// Q3. Write a Java program that read 5 numbers and print the average of all values.


import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        System.out.println("enter a 1st no. :");
        int n1=jk.nextInt();
       System.out.println("enter a 2nd no. :");
        int n2=jk.nextInt();
        System.out.println("enter a 3rd no. :");
        int n3=jk.nextInt();
        System.out.println("enter a 4th no. :");
        int n4=jk.nextInt();
        System.out.println("enter a 5th no. :");
        int n5=jk.nextInt();
        float a=(n1+n2+n3+n4+n5)/5;
        System.out.println("average:"+a);

    }
}
