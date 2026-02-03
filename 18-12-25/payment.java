import java.lang.*;
import java.util.*;
class payment{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the payment status  :");
        String a = obj.nextLine();

       // System.out.println("Enter the password :");
        //String b = obj.nextLine();

        if (a.equals("success")) {
            System.out.println("Enter the status :");
            String status = obj.nextLine();

            if (status.equals("bill")) {
                System.out.println("Generate bill");
            } else {
                System.out.println("Update order status");
            }
        } else {
            System.out.println("Payment failed message");
        }
    }
}