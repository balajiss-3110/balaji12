import java.lang.*;
import java.util.*;
class task3{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the your mark");
         int a = obj.nextInt(); 

         
          if(a>= 0 && a<=100){
            
                 if(a>=35){
                     System.out.println("you pass ");             
                     }
                   else{
                       System.out.println("you fail");
                      }
}

            else{
               System.out.println("wrong input");
                }
             

}
}