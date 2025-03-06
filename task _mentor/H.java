

import java.util.Scanner;
public class H {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("enter a seconds");
        int n=op.nextInt();
        int h = n/3600;
        int m= (n%3600)/60;
        int s=((n%3600)%60);
    System.out.println("hours:"+h+""+"minutes:"+m +""+"seconds"+s);
    }
}
