import java.lang.*;
import java.util.Scanner;
class  A1{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
System.out.println("enter your name ");
String a =obj.nextLine();
System.out.println("enter your Score ");
int b =obj.nextInt();

obj.nextLine();

System.out.println("enter your deparatement ");
String c =obj.nextLine();
System.out.println("your name is "+a);
System.out.println("your deparatement is  "+c);
System.out.println("your cgpa is  "+b/10);

}}