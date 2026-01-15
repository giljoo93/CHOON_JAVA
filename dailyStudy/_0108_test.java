package dailyStudy;

import java.util.Scanner;

public class _0108_test {

	/*
	 * 84p 가위바위보 게임. 가위 바위 보 게임입니다. 가위,ㅂ 바위, 보 중에서 입력하세요 
	 * 철수 >> 가위 
	 * 영희 >> 보 
	 * 철수가 이겼습니다.
	 * 를 출력하게끔 코딩하라.
	 */

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위,ㅂ 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String 철수 = userInput.next();
		System.out.print("영희 >> ");
		String 영희 = userInput.next();
		
		switch (철수) {
		
		case "가위":
			if (영희.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if (영희.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}else if (영희.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			break;
		case "바위":
			if (영희.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if (영희.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if (영희.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			break;
		case "보":
			if (영희.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if (영희.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}else if (영희.equals("보")) {
				System.out.println("비겼습니다.");
			}
			break;

		}
		userInput.close();
	}

}
