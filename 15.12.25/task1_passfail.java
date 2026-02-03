import java.lang.*;
import java.util.Scanner;
class passfail{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your mark");
       int a =obj.nextInt();
       if(a>=35){
       System.out.println("you pass");
}
       else{
       System.out.println("fail");
}
}}