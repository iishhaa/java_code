// wap to take input by user ??

import java.util.Scanner;
     class A{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a name :");
            String name=sc.nextLine();
            System.out.println("Enter Address :");
            String ad=sc.nextLine();
            System.out.println("Enter a year :");
            String year =sc.nextLine();
            System.out.println("Enter a section");
            char s=sc.next().charAt(0);
            System.out.println("Enter a roll no.");
            int r=sc.nextInt();

            System.out.println("name :"+name);
             System.out.println("Address :"+ad);
              System.out.println("year :"+year);
               System.out.println("section :"+s);
                System.out.println("roll no.:"+r);
        }
    }