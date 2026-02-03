import java.lang.*;
import java.util.Scanner;

class lasteven {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = obj.nextInt();

        int lastDigit = num % 10;

        if (lastDigit % 2 == 0) {
            System.out.println("The last digit is even");
        } else {
            System.out.println("The last digit is odd");
        }
    }
}
