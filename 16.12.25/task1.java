import java.lang.*;
import java.util.*;
class task1{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = obj.nextInt();
        if(a>0){
         System.out.println("the number is positive");
         }
        else if(a<0){
         System.out.println("the number is negative");
         }
         else{
         System.out.println("negative or positive");
         }
}
}