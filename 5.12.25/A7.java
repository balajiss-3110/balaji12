import java.lang.*;
import java.util.Scanner;
class A7{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number");
int a=obj.nextInt();
if(a%3==a%5){
System.out.println("the number is devisible by both 3 & 5");

}
else{
System.out.println("the number is  not devisible by both 3 & 5");
}
}
}