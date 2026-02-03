import java.lang.*;
import java.util.*;
class task5{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number A");
        int a = obj.nextInt();
        System.out.println("Enter the number B");
        int b = obj.nextInt();
        System.out.println("Enter the number c");
        int c = obj.nextInt();
        if(a == b && b==c){
         System.out.println("all equal");
         }
        else if(a==b || b==c || c==a){
         System.out.println("Two numbers are equal");
         }
         
         else{
         System.out.println("all different");
         }
}
}