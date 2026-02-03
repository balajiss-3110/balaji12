import java.lang.*;
import java.util.Scanner;
class buzz{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your number");
       int a =obj.nextInt();
       if(a%5 == 0){
       System.out.println("Buzz");
}
       else{
       System.out.println("Not Buzz");
}
}}