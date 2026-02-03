import java.lang.*;
import java.util.Scanner;
class A6{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter your income amount");
int income=obj.nextInt();
if(income>7000){
System.out.println("scholarship avalible");
}
else{
System.out.println("Scholarship not avalible");
}
}
}