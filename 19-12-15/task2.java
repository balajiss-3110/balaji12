import java.lang.*;
import java.util.*;
class task2{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Frist number");
         int a = obj.nextInt(); 

         System.out.println("Enter the Second number");
         int b = obj.nextInt();

          if(a != b){
             System.out.println("Both are not equal");
                 if(a>b){
                     System.out.println("First number is greater ");             
                     }
                   else{
                       System.out.println("second  number is greater");
                      }
}

            else{
               System.out.println("Bothe are equal");
                }
             

}
}