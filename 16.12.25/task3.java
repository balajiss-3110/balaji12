import java.lang.*;
import java.util.*;
class task4{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = obj.nextInt();
        if(a%11==0 && a%5==0){
         System.out.println("divisible by only 11 & 5");
         }
        else if(a%5==0){
         System.out.println("divisible by only 5");
         }
         else if(a%11==0){
         System.out.println("divisible by only 11");
         }
         else{
         System.out.println("not divisible by 5 or 11");
         }
}
}