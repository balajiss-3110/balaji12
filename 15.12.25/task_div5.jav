import java.lang.*;
import java.util.Scanner;

class div5 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = obj.nextInt();

        if(num % 5==0) {
            Syst
 jem.out.println("it is divisible by 5");
        } else {
            System.out.println("it is not divisible by 5");
        }
    }
}
