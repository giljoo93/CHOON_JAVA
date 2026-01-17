package dailyStudy;

import java.util.Scanner;

public class _0115_Hanoi3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
//		바이너리 베이스로 하노이스텍 구현하고, 재귀로 이동값 지정하기.
		int objectPosition;
		int gameLevel =3;

		System.out.println("Welcome to Hanoi tower!");
		System.out.println("Please setting game level(1~10)");
		System.out.print("level : ");
		
		gameLevel = userInput.nextInt();
		
		System.out.println("Now.. Create Hanoi tower...");
	}
	
	public static void SetLevel(int level, int stack, int temp) {
		
		if(level == 0) return;
			
		stack = (0b01 << 2);
		level--;
		SetLevel(level, stack, temp);
	}
	
}