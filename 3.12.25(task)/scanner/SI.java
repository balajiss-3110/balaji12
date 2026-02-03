import java.lang.*;
import java.util.Scanner;
class A1{
public static void main(String args[]){
        Scanner abj=new Scanner(System.in);
        System.out.println("enter the principla value ");
        int p = abj.nextInt();
        System.out.println("enter the rate value ");
        int r = abj.nextInt();
        System.out.println("enter the time value ");
        int t = abj.nextInt();
        int si = (p*r*t)/100;
           System.out.println("principal value is "+p);
           System.out.println("rate value is "+r);
           System.out.println("time value is "+t);
            System.out.println("SI value is "+si);
}}