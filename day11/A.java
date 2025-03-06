
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("press +for addition");
        System.out.println("press - for subtraction");
        System.out.println("press * for multiplication");
        System.out.println("press / for division");
       char ch=sk.next().charAt(0);
       System.out.println("Enter a n1");
       int n1=sk.nextInt();
        System.out.println("Enter a n2" ) ;
        int n2=sk.nextInt();
        int n3=n1+n2;
        int n4=n2-n1;
        int  n6=n1/n2;
        int n5=n1*n2;
        switch (ch) {
            case '+':
            System.out.println("Addition :"+n3);
                break;
                case '-':
        System.out.println("Subtraction"+n4);
        break;
        case '*':
        System.out.println("multiplication"+n5);
        break;
        case '/':
        System.out.println("dividede"+n6);
            default: 
                break;
        }

    }
}
