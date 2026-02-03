import java.lang.*;
import java.util.Scanner;

class BMI {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Temperature ");
        int BMI = obj.nextInt();

        if (BMI >= 35 && BMI <= 40) {
            System.out.println("Severely obese");
        }
        else if (BMI >= 30 && BMI < 35) {
            System.out.println("obese");
        }
        else if (BMI >= 25 && BMI < 30) {
            System.out.println("overweight");
        }
        else if (BMI >= 18 && BMI < 25) {
            System.out.println("normal");
        }
        else {
            System.out.println("underweight");
        }
    }
}
