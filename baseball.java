import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Baseball {

    static int running;
    static Scanner scanner = new Scanner(System.in);
    static final int NUMBER_COUNT = 3; // Number of digits to guess

    public static void main(String[] args) {

        while (true) {
            System.out.println("Play baseball game.");
            System.out.println("1.Start 0.Exit");
            running = scanner.nextInt();

            if (running == 0) {
                System.out.println("Quit Program.");
                return;
            }

            int[] computerNumbers = createRandomNumbers(NUMBER_COUNT);

            boolean isGameWon = false;
            while (!isGameWon) {
                if (running == 96) { // cheat code : 96
                    System.out.println("cheat : " + Arrays.toString(computerNumbers));
                }

                int[] userNumbers = getUserInput(NUMBER_COUNT);
                isGameWon = checkCondition(computerNumbers, userNumbers);
            }
        }
    }

    public static int[] createRandomNumbers(int count) {
        if (count > 10) {
            throw new IllegalArgumentException("Cannot generate more than 10 unique digits (0-9).");
        }
        int[] numbers = new int[count];
        boolean[] isUsed = new boolean[10];
        int generatedCount = 0;

        while (generatedCount < count) {
            int randomNum = (int) (Math.random() * 10);
            if (!isUsed[randomNum]) {
                numbers[generatedCount] = randomNum;
                isUsed[randomNum] = true;
                generatedCount++;
            }
        }
        return numbers;
    }

    public static int[] getUserInput(int count) {
        int[] userNumbers = new int[count];
        System.out.println(count + "가지 숫자를 하나씩 입력하세요 (0-9).");

        for (int i = 0; i < count; i++) {
            boolean isValidInput = false;
            while (!isValidInput) {
                try {
                    System.out.print((i + 1) + " Number: ");
                    int inputNum = scanner.nextInt();

                    if (inputNum < 0 || inputNum > 9) {
                        System.out.println("0부터 9까지의 숫자를 입력해주세요.");
                    } else {
                        userNumbers[i] = inputNum;
                        isValidInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }
        return userNumbers;
    }

    public static boolean checkCondition(int[] computerNumbers, int[] userNumbers) {
        int strike = 0, ball = 0;
        int count = computerNumbers.length;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (computerNumbers[i] == userNumbers[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

        System.out.println("result : " + strike + "Strike " + ball + "Ball ");

        if (strike == count) {
            System.out.println("Win");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
