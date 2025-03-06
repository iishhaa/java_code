
// 
import java.lang.invoke.SwitchPoint;

import util.java.Scanner;

public class C {
    public static void main(String[] args) {
        char c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any character :");
        c=obj.next().charAt(0);
        Switch(c){
        case 'a':
        case 'A':
        System.out.println("it is vowel");
        break;
        case 'e':
        case 'E':
        System.out.println("it is vowel");
        break;
        case 'i':
        case 'I':
        System.out.println("it is vowel");
        break;
        case 'o':
        case 'O':
        System.out.println("it is vowel");
        break;
        case 'u':
        case 'U':
        System.out.println("it is vowel");
        break;
    
        Default{
       System.out.println("it is not a vowel");
        }
    }
}
