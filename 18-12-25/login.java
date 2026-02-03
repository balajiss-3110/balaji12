import java.lang.*;
import java.util.*;
class login{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the user name :");
        String a = obj.nextLine();

        System.out.println("Enter the password :");
        String b = obj.nextLine();

        if(a.equals("Admin")){
          if(b.equals("1234")){
              System.out.println("login successfull");
            }
           else{
            System.out.println("wrong input");
            }}
      
         else {
            System.out.println("invalide");
       }


}}