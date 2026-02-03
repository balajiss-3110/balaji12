import java.lang.*;
import java.util.Scanner;
class colour{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
System.out.println("what is the colour of the traffic light :");
String a = obj.nextLine();

if(a.equals("red")){
System.out.println("Stop");
}
else if(a.equals("yellow")){
System.out.println("Get ready");
}
else if(a.equals("green")){
System.out.println("Go");
}
else{
System.out.println("Wrong input");
}

}}