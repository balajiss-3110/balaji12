import java.lang.*;
import java.util.*;
class loop3{
public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter the staring value");
         int a= obj.nextInt();

          System.out.println(" enter the ending value");
         int b= obj.nextInt(); 

         for(int i=a;i<=b;i++){
             if(i%2 !=0){
           System.out.println("add number are " +i);
}
}
}
}