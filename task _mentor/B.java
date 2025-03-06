import java.util.Scanner;

public class B {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a divisor.:");
        int n=sc.nextInt();
        System.out.println("Enter a dividend.:");
        int s=sc.nextInt();
        int d=n/s;
        System.out.println("quotient:"+d);
    }
}
