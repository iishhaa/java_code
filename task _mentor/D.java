import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int f,c;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a celcius value:");
         c=sc.nextInt();
         f=(9*c+(32*5))/5;
         System.out.println("enter a fahrenheit  degree:");
         f=sc.nextInt();
         c=(5*(f-32))/9;
         System.out.println(" celcius to fahrenheit value :"+f);
        System.out.println("fahrenheit to celcius :"+c);
    }
    
}
