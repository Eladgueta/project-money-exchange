import javax.swing.*;
import java.util.Scanner;

public class Project {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        while (x != 0) {
            x--;


            System.out.println("Press  1 to convert a shekels to dollars");
            System.out.println("Press  2 to convert a dollars to shekels ");
            System.out.println("Press  3 to convert a euro to shekels");
            System.out.println("Press  4 to convert a shekels to euros ");
            System.out.println("press 0 to exit");
            int NUM = scanner.nextInt();

            if (NUM == 1) {
                System.out.println("Please enter the desired amount to convert from shekels to dollars");
                int amount1 = scanner.nextInt();
                System.out.println("Total amount in dollars for withdrawal " + amount1 / 3.5260 + "$");

            } else if (NUM == 2) {
                System.out.println("Please enter the desired amount to convert from dollars to shekels");
                int amount2 = scanner.nextInt();
                System.out.println("Total amount in shekels for withdrawal " + amount2 * 3.5260 + "NIS");

            } else if (NUM == 3) {
                System.out.println("Please enter the desired amount to convert from euros to shekels");
                int amount3 = scanner.nextInt();
                System.out.println("Total amount in euros for withdrawal " + amount3 * 3.6850 + " NIS");

            } else if (NUM == 4) {
                System.out.println("Please enter the desired amount to convert from shekels to euros");
                int amount4 = scanner.nextInt();
                System.out.println("Total amount in shekels for withdrawal " + amount4 / 3.6850 + " EUR");
            } else if (NUM == 0) {
                System.out.println("Done");


            }
        }
    }

}




























