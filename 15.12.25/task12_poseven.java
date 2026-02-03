import java.lang.*;
import java.util.Scanner;

class poseven {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the year:");
        int num = obj.nextInt();

        if(num>0 && num%2 == 0) {
            System.out.println("it is positive even number");
        } else {
            System.out.println("Wrong input");
        }
    }
}
