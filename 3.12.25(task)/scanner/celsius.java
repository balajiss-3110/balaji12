import java.lang.*;
import java.util.Scanner;
class celsius{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the fahrenheit value  ");
        int f=obj.nextInt();
         
             double celsius = (f-32)*5/9;
               System.out.println("celsius value is   "+celsius);
}}