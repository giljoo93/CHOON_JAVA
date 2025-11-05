package basic;

import utils.ActivityLogger;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ActivityLogger.log("Hyangchoon","Join to main menu");
            System.out.println("============================");
            System.out.println("Welcome to the Choon_JAVA!");
            System.out.println("----------------------------");
            System.out.println("Please select a menu number.");
            System.out.println("============================");
            System.out.println("(0)Login (1)Sign up (2)Exit");

            String choice = scanner.nextLine();

                // 0 Login
            if (choice.equals("0")) {
                ActivityLogger.log("Hyangchoon", "Try to log in");

                // 1 Sign up
            } else if (choice.equals("1")) {
                ActivityLogger.log("Hyangchoon", "Try to sign up");
                SignUp.register(scanner);

                // 2 Exit
            } else if (choice.equals("2")) {
                ActivityLogger.log("Hyangchoon", "Exit the program");
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
                // Exception handling for invalid input
            else {
                System.out.println("Invalid input. Please try again.");

            }

        }
    }
}