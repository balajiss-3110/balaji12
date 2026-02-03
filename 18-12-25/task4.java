import java.lang.*;
import java.util.*;
class task4{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the stock :");
        int a = obj.nextInt();

       // System.out.println("Enter the password :");
        //String b = obj.nextLine();

        if (a<=10) {
            //System.out.println("check eye test ");
            System.out.println("checking your payment   ");
            int b = obj.nextInt();

            if (b<=10) {
                System.out.println("stock unavalible ");
            } else {
                System.out.println("paid");
            }
        } else {
            System.out.println("out of stock ");
        }
    }
}