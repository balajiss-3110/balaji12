import java.lang.*;
import java.util.Scanner;
class fizz{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your number");
       int a =obj.nextInt();
       if(a%3 == 0){
       System.out.println("Fizz");
}
       else{
       System.out.println("Not Fizz");
}
}}