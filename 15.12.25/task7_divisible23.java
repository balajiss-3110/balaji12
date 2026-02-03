import java.lang.*;
import java.util.Scanner;
class divisible23{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your number");
       int a =obj.nextInt();
       if(a%2 == 0 && a%3 ==0){
       System.out.println("It is divisible 2 & 3");
}
       else{
       System.out.println("It is  not divisible 2 & 3");
}
}}