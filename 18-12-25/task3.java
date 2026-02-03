import java.lang.*;
import java.util.*;
class task3{
public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the age :");
        int a = obj.nextInt();

       // System.out.println("Enter the password :");
        //String b = obj.nextLine();

        if (a>=18) {
            //System.out.println("check eye test ");
            System.out.println("enter your resule  ");
            String status = obj.nextLine();

            if (status.equals("pass")) {
                System.out.println("license approved ");
            } else {
                System.out.println("license not approved");
            }
        } else {
            System.out.println("reject due to age ");
        }
    }
}