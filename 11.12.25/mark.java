import java.lang.*;
import java.util.Scanner;
class mark{
public static void main(String args[]){
Scanner mark = new Scanner(System.in);
         System.out.println("Enter your english mark");
          int a = mark.nextInt();
          System.out.println("Enter your maths mark");
          int b = mark.nextInt();
          System.out.println("Enter your social mark");
          int c = mark.nextInt();
           System.out.println("Enter your science mark");
           int d = mark.nextInt();
           System.out.println("Enter your tamil mark");
           int e = mark.nextInt();
int h=a+b+c+d+e;
System.out.println("total mark is  :"+h);
int g=h/5;
System.out.println("average mark is  :"+g);

if(g<35 && g>=35){
System.out.println("Additional class");
}
else{
System.out.println("you are goog");
}

}}