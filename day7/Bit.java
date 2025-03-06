import java.util.Scanner;
public class Bit {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a first no :");
         int a=obj.nextInt();
         System.out.println("enter a second no. :");
         int b=obj.nextInt();
       
       int c=a<b?a:b;
      //   System.out.println("maximum of two no."+c);
        System.out.println("minimum of two no.  "+c);
     }
}
