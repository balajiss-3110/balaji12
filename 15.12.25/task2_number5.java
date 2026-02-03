import java.lang.*;
import java.util.Scanner;
class number5{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your number");
       int a =obj.nextInt();
       if(a%5 == 0){
       System.out.println("yes divisible by 5");
}
       else{
       System.out.println("No divisible by 5");
}
}}