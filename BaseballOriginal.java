import java.util.Scanner;

public class BaseballOriginal {

	static int[] randomSetArrayN = new int[3];
	static int[] userSetArrayN = new int[3];
	static int Running;
	static Scanner scanner = new Scanner(System.in);
	static boolean answer;

	public static void main(String[] args) {

		while (true) {

			System.out.println("야구게임을 시작합니다.");
			System.out.println("1.게임시작 0.게임종료");
			Running = scanner.nextInt();

			if (Running == 0) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			randomSet(); // Sets 3 random numbers

			answer = false;
			while (answer == false) {

				if (Running == 96) { // cheat code : 96
					System.out.println("정답 : " + randomSetArrayN[0] + randomSetArrayN[1] + randomSetArrayN[2]);
				}

				userSet(); // User input: enter 3 numbers

				checkCondition();// Checks if values meet the condition
			}
		}
	}

	public static void randomSet() {
		boolean pass = false;

		while (!pass) {
			randomSetArrayN[0] = (int) (Math.random() * 10);
			randomSetArrayN[1] = (int) (Math.random() * 10);
			randomSetArrayN[2] = (int) (Math.random() * 10);

			if (randomSetArrayN[0] != randomSetArrayN[1] && randomSetArrayN[0] != randomSetArrayN[2]
					&& randomSetArrayN[1] != randomSetArrayN[2]) {
				pass = true;
			}
		}
	}

	public static void userSet() { // 세가지 숫자를 한 번에 입력 받기 + try catch 빼고, 문자열 입력 받지 않기.
		String userSetN = "0";
		int userSetiN = 0;
		char c;
		boolean test = false;

		System.out.println("세자리 숫자를 입력하세요.");

		while (!test) {
			userSetN = scanner.nextLine();
			for (int i = 0; i < userSetN.length(); i++) {
				c = userSetN.charAt(i);
				if (c < '0' && c > '9') {
					test = false;
					break;
				}else {
					test = true;
				}
			}
			userSetiN = Integer.parseInt(userSetN);
			boolean test2 = false;
			while (!test2) {
				if (userSetiN > 999 || userSetiN < 012) {
					System.out.println("잘못된입력입니다. 세자리 정수를 입력하세요");
					test = false;
				} else {
					test2 = true;
				}
			}
		}

		userSetArrayN[0] = userSetiN / 100;
		userSetArrayN[1] = (userSetiN / 10) % 10;
		userSetArrayN[2] = userSetiN % 10;

	}

	public static void checkCondition() {
		int i = 0, j = 0;
		int strike = 0, ball = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (randomSetArrayN[i] == userSetArrayN[j]) {
					if (i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}

		}
		System.out.println("result : " + strike + "Strike " + ball + "Ball ");

		if (strike == 3) {
			System.out.println("승리하였습니다.");
			answer = true;

		} else {
			System.out.println("오답입니다.");

		}

	}

}