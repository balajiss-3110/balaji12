import java.lang.*;
import java.util.*;

class mark {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the mark");
        int mark = obj.nextInt();

        int fee = 50000;

        if (mark >= 80 && mark <= 100) {
            int discount = fee * 25 / 100;
            int finalFee = fee - discount;

            System.out.println("Your grade is A");
            System.out.println("Fee after 25% discount: " + finalFee);
        }
                else if (mark >= 60 && mark <= 80) {
            int discount = fee * 15 / 100;
            int finalFee = fee - discount;

            System.out.println("Your grade is B");
            System.out.println("Fee after 15% discount: " + finalFee);
        }

                 else if (mark >= 0 && mark <= 60) {
            
            System.out.println("Your grade is C");
            System.out.println("Fee after 0% discount: " + fee);
        }
    }
}
