import java.lang.*;
import java.util.Scanner;

class lastdigit {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = obj.nextInt();

        if (num % 10 == 0) {
            System.out.println("The last digit is 0");
        } else {
            System.out.println("The last digit is not 0");
        }
    }
}
