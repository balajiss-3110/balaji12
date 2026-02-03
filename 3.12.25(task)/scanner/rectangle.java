import java.lang.*;
import java.util.Scanner;
class rectangle{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle  ");
        int l=obj.nextInt();
          System.out.println("Enter the width of the rectangle  ");
           int w=obj.nextInt();
             int Area = l*w;
               System.out.println("Area of the rectangle  "+Area);
}}