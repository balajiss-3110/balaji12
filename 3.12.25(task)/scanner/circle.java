import java.lang.*;
import java.util.Scanner;
class circle{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of the circle  ");
        int r=obj.nextInt();
         
             double Area = 3.14*r*r;
               System.out.println("Area of the circle  "+Area);
}}