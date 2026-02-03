import java.lang.*;
import java.util.*;
class loop1{
public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter the staring value(bigger number )");
         int a= obj.nextInt();

          System.out.println(" enter the ending value(smaller number)");
         int b= obj.nextInt(); 

         for(int i=a;i>=b;i--){
           System.out.println(i);
}
}
}