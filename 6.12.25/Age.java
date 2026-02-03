import java.lang.*;
import java.util.Scanner;
class Age{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
System.out.println("Enter your age ");
int age=obj.nextInt();

       if(age>=1 && age<10){
System.out.println("you are child");
}
          else if(age>=10 && age<18){
System.out.println("you are teenage");
}
                     else if(age>=18 && age<45){
System.out.println("you are Adult");
}
                      else if(age>=45){
System.out.println("you are senior");
}
                       else {
System.out.println("wrong input");
}
}}