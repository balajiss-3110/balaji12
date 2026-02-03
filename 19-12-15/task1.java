import java.lang.*;
import java.util.*;
class task1{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
         int a = obj.nextInt();

          if(a>1){
             System.out.println("the number is positive");
                 if(a%2==0){
                     System.out.println("the number is positive and even");             
                     }
                   else{
                       System.out.println("the number is positive and add");
                      }
}

            else{
               System.out.println("the number is negative and even or even");
                }
             

}
}