import java.lang.*;
import java.util.*;
class task4{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the your age");
         int a = obj.nextInt(); 

         
          if(a>= 1 && a<=100){
            
                 if(a>=18){
                     System.out.println("your are eligible ");             
                     }
                   else{
                       System.out.println("your are not eligible");
                      }
}

            else{
               System.out.println("wrong input");
                }
             

}
}