import java.util.Scanner;
      class Empl{
             public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Employee Name :");
                 String name=sc.nextLine();
               System.out.println("Enter Salary :");
                float sal=sc.nextFloat();
            
                 System.out.println("Enter job profile :");
                

                 String pr=sc.nextLine();
                 System.out.println("Enter empNo :");
                 int no=sc.nextInt();
                 System.out.println("Enter deptno. :");
                 int dept=sc.nextInt();
                  System.out.println("Enter a Grade");
                   char s=sc.next().charAt(0);
       

                     System.out.println("Employee Name :"+name);
                     System.out.println("Enter Salary :"+sal);
                         System.out.println("Enter job profile :"+pr);
                        System.out.println("Enter empNo :"+no);
                         System.out.println("Enter deptno. :"+dept);
                          System.out.println("Enter a Section"+s);
           }
}