import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
    Scanner sk=new Scanner(System.in);
    String str=sk.nextLine();
  char reversestring[]=str.toCharArray();
  for(int i= reversestring.length-1;i>=0;i--){
   System.out.print(reversestring[i]);
  }
}
}
