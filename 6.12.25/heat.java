import java.lang.*;
import java.util.Scanner;

class Heat {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Temperature ");
        int temp = obj.nextInt();

        if (temp >= 60 && temp <= 70) {
            System.out.println("Extreme heat");
        }
        else if (temp >= 50 && temp < 60) {
            System.out.println("Very hot");
        }
        else if (temp >= 40 && temp < 50) {
            System.out.println("hot");
        }
        else if (temp >= 30 && temp < 40) {
            System.out.println("warm");
        }
        else {
            System.out.println("cold");
        }
    }
}
