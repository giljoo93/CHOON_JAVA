package dailyStudy;

import java.util.Scanner;

public class _0107Hanoi {
	static final int gameLevel = 6;
	static int[] tower_A = new int[gameLevel], tower_B = new int[gameLevel], tower_C = new int[gameLevel];
	static int[] userChoice_A = new int[gameLevel], userChoice_B = new int[gameLevel];
	static boolean running = true;
	static int tryCnt =0;
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//메인 메서드
		int move_A, move_B; // 유저가 이동을 명령 할 값을 담을 변수.
		
		//실무에서 축약을 하는 유형 중 하나	tmp == temp   ::  cnt == count
		
		tower_A[0] = 5;
		tower_A[1] = 4;
		tower_A[2] = 3;
		tower_A[3] = 2;
		tower_A[4] = 1;
		tower_A[5] = 0;
		
		for (int i=0; i <6; i++) {
			tower_B[i] = 0;
			tower_C[i] = 0;
		}
		
		while (running) {
		
		screen();
		System.out.println("하노이 타워 게임입니다.");
		System.out.println();
		System.out.println(tryCnt +" 번째 시도입니다.");
		System.out.println("오브젝트를 이동시키려는 타워를 입력하세요.(1)~(3)");
		move_A = userInput.nextInt();
		System.out.println("오브젝트를 어떤 타워로 이동시킬까요?(1)~(3)");
		move_B = userInput.nextInt();
		
		arrSet(move_A, move_B);
		move(userChoice_A,userChoice_B);
		tryCnt ++;
		win();
		}
		userInput.close();
		//최상단의 오브젝트를 가지고 오는 메서드가 필요하겠다. bringTopObject() - 완료
		//해당 타워 배열에서, 가장 하단의 오브젝트를 찾는 메서드가 필요하겠다.
		// ( 만약, 값이 null 없다면, 없는대로 배열의 가장 첫 값 tower_N[0] 반환)
		//	tower_A[i] - index ;; 	bringLowIndex() - 완료
		
		// userChoice_A <-> userChoice_B 서로 크기비교하여, 옮길 수 있는지 없는지
		//판단하는 메서드가 필요하겠다 judgeValue() - 아래 43번과 합쳤음
		
		//userChoice_B 값에 userChoice_A 값을 대입시키고, 
		//userChoice_A 값에서 가장 작은 오브젝트를 제거 할 메서드가 필요하겠다.	 -완료
		
		//각 타워 A,B,C 를 사용자에게 보여줄 메서드 screen, show	메서드가 필요하겠다. 
		//A의 오브젝트들이 C로 모두 옮겨졌을 때. 승리했다라는 조건을 담을 메서드가 필요하겠다.
	}
		
	// 유저의 입력을 타워의 배열값과 연결시키는 메서드
	// 일종의 temp 변수?
	public static void arrSet(int a, int b) {
			
		switch (a) {
		case 1:
			userChoice_A = tower_A;
			break;
		case 2:
			userChoice_A = tower_B;
			break;
		case 3:
			userChoice_A = tower_C;
			break;
		default :
			//망함 현재로서는 대체 방법이 없음.	
		}
		
		switch (b) {
		case 1:
			userChoice_B = tower_A;
			break;
		case 2:
			userChoice_B = tower_B;
			break;
		case 3:
			userChoice_B = tower_C;
			break;
		default :
			//망함 현재로서는 대체 방법이 없음.	
		}
	}
	
	//가장 작은 배열의 오브젝트의 값을 반환한다.
	public static int bringTopObject(int top[]) {
			
		int temp;
		
			temp = top[0];
			for(int i = 0; i < top.length; i++) {
				if (temp > top[i] && top[i] != 0) {
					temp = top[i];
				}
		}		
		return temp;
	}
	
	//가장 작은 배열의 인덱스 값을 반환한다.
	public static int bringLowIndex(int top[]) {
		
		int temp;
		int index = 0;
			temp = top[0];
			for(int i = 0; i < top.length; i++) {
				if (temp > top[i] && top[i] != 0) {
					temp = top[i];
					index = i;
				}
			}		
			return index;
		
	}
	

	
	//실질적인 크기 비교와, B로 A의 값을 대입, A의 값은 0으로 초기화처리
	public static void move(int[] a, int[] b) {
		

//		bringLowIndex(userChoice_A); // Tower_A[5] = return -> 5
//		bringLowIndex(userChoice_B); // Tower_B[0] = return -> 0
		
		if(bringTopObject(userChoice_B) == 0) {
			
			userChoice_B[bringLowIndex(userChoice_B)] = 
					userChoice_A[bringLowIndex(userChoice_A)];
			userChoice_A[bringLowIndex(userChoice_A)] = 0;
			// tower_B[0] = 1 // Tower_A[5] = 0
			
		}else if(bringTopObject(userChoice_A) <
				bringTopObject(userChoice_B)) {
			
			userChoice_B[bringLowIndex(userChoice_B)+1] =
					userChoice_A[bringLowIndex(userChoice_A)];
			userChoice_A[bringLowIndex(userChoice_A)] = 0;
		}

	}
	
	//사용자에게 출력 할 화면
	public static void screen() {
			
		for(int i=0; i<50; i++) {
			System.out.println();
		}
		for(int i=0; i < tower_A.length; i++) {
			System.out.print(tower_A[tower_A.length-i-1]);
			System.out.print(tower_A[tower_A.length-i-1]);
			System.out.print(tower_A[tower_A.length-i-1]);
			System.out.print(" ");
			System.out.print(tower_B[tower_A.length-i-1]);
			System.out.print(tower_B[tower_A.length-i-1]);
			System.out.print(tower_B[tower_A.length-i-1]);
			System.out.print(" ");
			System.out.print(tower_C[tower_A.length-i-1]);
			System.out.print(tower_C[tower_A.length-i-1]);
			System.out.print(tower_C[tower_A.length-i-1]);
			System.out.println();
			
		}
		System.out.print("-1- -2- -3- (Tower number)");

	}
	
	public static void win() {
		if (tower_C[4]==1 && tower_C[3]==2 &&tower_C[2]==3 &&
				tower_C[1]==4 && tower_C[0]==5) {
			screen();
			System.out.println("승리하였습니다.");
			running = false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
