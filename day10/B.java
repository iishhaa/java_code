
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        char c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a character");
        c=obj.next().charAt(0);
        if(c>='a'){
       if(c<='z')
       System.out.println("this is lowe case");

}
else if(c>='A'){
    if(c<='Z')
    System.out.println("this is upper case");
}
    }
}
