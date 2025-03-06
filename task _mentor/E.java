import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         System.out.println("No. of days :");
         int n=obj.nextInt();
         int y=n/365;
         int m=(y)/30;
         int d=(y)%30;
        System.out.println("year :"+""+y+"months:"+""+m + "days :"+""+d);
    }
}
