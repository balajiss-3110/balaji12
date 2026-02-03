import java.lang.*;
import java.util.*;
class task6{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the satary amount");
        int a = obj.nextInt();
        
        if(a>=50000){
         System.out.println("high salary");
         }
        else if(a>=30000 && a<=49999){
         System.out.println("Medium income");
         }
         
         else{
         System.out.println("low income");
         }
}
}