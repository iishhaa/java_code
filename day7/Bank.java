import java.util.Scanner;
class Bank{
    public static void main(String args[]){
        int a,rm,n;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        a=sk.nextInt();//1388
        n=a/100;
        System.out.println("notes of 100 :"+n);
        rm=rm-n*50;
        n=rm/20;
        System.out.println("notes of 20 :"+n);
        rm=rm-n*20;
        n=rm/10;
        System.out.println("notes of 10 :"+n);
        rm=rm-n*10;
        n=rm/5;

    }
}