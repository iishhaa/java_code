import java.util.Scanner;

public class Simple_interest {
    //wap to calculate simple interset
 public static void main(String[] args){
    Scanner sk=new Scanner(System.in);
    System.out.println("enter principle :");
    int p=sk.nextInt();
    System.out.println("enter rate");
    int r=sk.nextInt();
    System.out.println("enter time in months :");
    int t=sk.nextInt();
    System.out.println("Simple interest ==>  Pxrxt/100 ==>  "+(p*r*t)/100);
     
 }
}

