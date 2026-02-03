import java.lang.*;
import java.util.*;
class task5{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number");
         int a = obj.nextInt(); 

       System.out.println("Enter the second number");
         int b = obj.nextInt(); 

       System.out.println("Enter the Third number");
         int c = obj.nextInt(); 


         
          if(a!=b && b!=c){
            
                 if(a>b && a>c){
                     System.out.println("First number is bigger ");             
                     }
                   else if(b>a && b>c){
                       System.out.println("Second number is greater");
                      }
                    else {
                       System.out.println("third number is greater");
                      }
}

            else{
               System.out.println("All are equal");
                }
             

}
}