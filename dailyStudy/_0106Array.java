package dailyStudy;

import java.util.Scanner;

public class _0106Array {
	static int[] tower_A = new int[6], tower_B = new int[6], tower_C = new int[6];
	static int[] choice_a = new int[6], choice_b = new int[6];
	static boolean running = true;
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("하노이타워입니다.");
		tower_A[5] = 8; // 
		tower_A[4] = 1;
		tower_A[3] = 2;
		tower_A[2] = 3;
		tower_A[1] = 4;
		tower_A[0] = 5;
		
		tower_B[5] = 8;
		tower_B[4] = 8;
		tower_B[3] = 8;
		tower_B[2] = 8;
		tower_B[1] = 8;
		tower_B[0] = 8;
		
		tower_C[5] = 8;
		tower_C[4] = 8;
		tower_C[3] = 8;
		tower_C[2] = 8;
		tower_C[1] = 8;
		tower_C[0] = 8;
		
		while(running) {
		
			show();
		
		
		System.out.println("이동시킬 오브젝트가 있는 타워의 번호를 입력하세요.(1)~(3)");
		int a = userInput.nextInt(); 
		System.out.println("오브젝트를 최종적으로 옮길 타워의 번호를 입력하세요.(1)~(3)");
		int b = userInput.nextInt();

		move(a, b);
		win();
		
		}
	}

	public static void move(int a, int b) {

		towerCheck(a,b);
		checkValue(choice_a, choice_b);
	}

	public static void towerCheck(int a, int b) {

		
		
		switch (a) {
		case 1:
			choice_a = tower_A;
			break;
		case 2:
			choice_a = tower_B;
			break;
		case 3:
			choice_a = tower_C;
			break;
		default:
//			되돌려서 입력 다시 받아야함.
		}

		switch (b) {
		case 1:
			choice_b = tower_A;
			break;
		case 2:
			choice_b = tower_B;
			break;
		case 3:
			choice_b = tower_C;
			break;
		default:
//			되돌려서 입력 다시 받아야함.
		}

	}

	public static void checkValue(int a[], int b[]) {
//		a 이동 이전 지역, b 이동 지역 
		if (stack(a) < stack(b)) {
			System.out.println("가능합니다.");
			choice_b[pushAndStack(b)-1] = choice_a[pushAndStack(a)];
			choice_a[pushAndStack(a)] = 8;
		}else {
			System.out.println("불가능합니다.");
		}

	}
	
	public static int pushAndStack(int a[]) {
		int temp, tempIndex = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (int j = 0; j < a.length; j++) {
				if (temp > a[j]) {
					temp = a[j];
					tempIndex = j; // a 배열의 가장 작은 값의 상위에 배열번호를 저장

				}else if(temp == 8) {
					tempIndex = 0;
				}
			}
		}
		return tempIndex;
	}

	public static int stack(int a[]) {
		int temp, result = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (int j = 0; j < a.length; j++) {
				if (temp > a[j]) {
					temp = a[j];
					result = temp; // a 배열의 가장 작은 값을 result에 저장

				}
			}
		}
		return result;
	}
	
	public static void win() {
		if (tower_C[4] == 1 &&tower_C[3] == 2 && 
				tower_C[2] == 3 && tower_C[1] == 4 &&tower_C[0] == 5) {
			running = false;
			System.out.println("승리하셨습니다.");
		}
	}

	public static void show() {
		for (int i=0; i<tower_A.length; i++) { //줄바꿈 단
			for (int j =0; j<3; j++) { //tower_A
				System.out.print(tower_A[tower_A.length - 1 - i]);
			}
			System.out.print(" ");
			for (int j =0; j<3; j++) { //tower_B
				System.out.print(tower_B[tower_B.length - 1 - i]);
			}
			System.out.print(" ");
			for (int j =0; j<3; j++) { //tower_C
				System.out.print(tower_C[tower_C.length - 1 - i]);
			}
			System.out.println(" ");
			
		}
		System.out.println("(1) (2) (3)");
	}
}
