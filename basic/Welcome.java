package basic;

import utils.ActivityLogger;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("Welcome to the Choon_JAVA!");
        System.out.println("----------------------------");
        System.out.println("Please select a menu number.");
        System.out.println("============================");
        System.out.println("(0)Login (1)Sign up (2)Exit");

        String choice = scanner.nextLine();

        if (choice.equals("0")) {
            ActivityLogger.log("Hyangchoon", "Try to log in");
        } else if (choice.equals("1")) {
            ActivityLogger.log("Hyangchoon", "Try to sign up");
        } else {
            ActivityLogger.log("Hyangchoon", "Exit the program");
        }
    }
}