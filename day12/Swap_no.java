import java.util.Scanner;

public class Swap_no {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("enter no1 a ");
int a=sk.nextInt();
        System.out.println("enter no2 b ");
int b=sk.nextInt();
// int  t=a;
// a=b;
// b=t;
a=a+b;//7
b=a-b;//7-5
a=a-b;
System.out.println("a = "+a);
System.out.println("b="+b);


    }
}
