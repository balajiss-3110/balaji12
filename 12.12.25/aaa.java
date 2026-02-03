import java.lang.*;
import java.util.Scanner;
class aaa{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
      System.out.println("Enter your age");
      int age = obj.nextInt();
      System.out.println("Enter your salary");
      int salary = obj.nextInt();
  if(age<=25 &&  salary>= 20000){
System.out.println("Enter required loan amount");
   int loan=obj.nextInt();
    if(loan>50000){
System.out.println("maximun loan amount is 50,000");
}
else{
System.out.println("loan avalible");
}
}
else
{
System.out.println("you are  not eligible");
}
}
}