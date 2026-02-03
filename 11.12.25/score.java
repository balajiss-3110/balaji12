import java.lang.*;
import java.util.Scanner;
class score{
public static void main(String args[])
{
Scanner score = new Scanner(System.in);
System.out.println("Enter your mark  :");
int a = score.nextInt();

if(a<50){
System.out.println("You need to improve");

}
else if (a>=50 && a<=70){
System.out.println("good job");
}
else if (a>70){
System.out.println("excelent performance");}
}}