import java.lang.*;
import java.util.Scanner;
class fizzbuzz{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your number");
       int a =obj.nextInt();
       if(a%15 == 0){
       System.out.println("FizzBuzz");
}
       else{
       System.out.println("Not FizzBuzz");
}
}}