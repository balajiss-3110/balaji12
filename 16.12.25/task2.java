import java.lang.*;
import java.util.*;
class task2{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the mark");
        int a = obj.nextInt();
        if(a>=90 && a<=100){
         System.out.println("A grade");
         }
        else if(a>=75 && a<90){
         System.out.println("B grade");
         }
         else if(a>=60 && a<75){
         System.out.println("c grade");
         }
         else{
         System.out.println("Fail");
         }
}
}