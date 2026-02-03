import java.lang.*;
import java.util.*;
class loop{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);


       System.out.println("Enter the starting value ");
        int a = obj.nextInt();


          System.out.println("Enter the ending value ");
        int b = obj.nextInt();

         int count = 0;
       
         for (int i=a;i<=b;i++)
           if(i%2 == 0){
              System.out.println("even number is " +i);
                 count=count+1;
               }
               
                 System.out.println("the count is " +count);
}
}