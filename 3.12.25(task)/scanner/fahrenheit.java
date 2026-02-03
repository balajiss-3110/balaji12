import java.lang.*;
import java.util.Scanner;
class fahrenheit{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the celsius value  ");
        int c=obj.nextInt();
         
             double fahrenheit = (c*9/5)+32;
               System.out.println("Fahrenheit value is   "+fahrenheit);
}}