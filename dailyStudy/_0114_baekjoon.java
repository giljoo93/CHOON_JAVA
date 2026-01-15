package dailyStudy;

import java.util.Scanner;

public class _0114_baekjoon {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("입력하시오.");
		while (userInput.hasNext()) {

			int a = userInput.nextInt();
			int b = userInput.nextInt();
			
			System.out.println(a + b);

		}
		userInput.close();

	}
}