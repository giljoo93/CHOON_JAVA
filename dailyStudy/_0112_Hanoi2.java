package dailyStudy;

import java.util.Scanner;

public class _0112_Hanoi2 {

	/*
	 * Hanoi tower version2 배열 빼기 , 별모양 만들기, 전역변수 없애기
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userChoice_A, userChoice_B;
		String tower_A = "123", tower_B = "", tower_C = "";
		String Choice_A = "", Choice_B = "";
		final int gameLevel = 3; //난이도 변경 금지
		String n = "", m = "";
		while (true) {

			screen(tower_A, tower_B, tower_C, gameLevel);

			System.out.println("하노이 타워 게임입니다.");
			System.out.println();
//		System.out.println(tryCnt +" 번째 시도입니다.");
			System.out.println("오브젝트를 이동시키려는 타워를 입력하세요.(1)~(3)");
			userChoice_A = userInput.nextInt();
			System.out.println("오브젝트를 어떤 타워로 이동시킬까요?(1)~(3)");
			userChoice_B = userInput.nextInt();

//			사용자 값 입력에 따른, 매핑처리
			switch (userChoice_A) {
			case 1:
				Choice_A = tower_A;
				break;
			case 2:
				Choice_A = tower_B;
				break;
			case 3:
				Choice_A = tower_C;
				break;
			}
			switch (userChoice_B) {
			case 1:
				Choice_B = tower_A;
				break;
			case 2:
				Choice_B = tower_B;
				break;
			case 3:
				Choice_B = tower_C;
				break;
			}

//			사용자 값 입력에 따른 이동(매핑처리)
				String resultCode = moveOrder(Choice_A, Choice_B);
				
				switch (userChoice_A) {
				case 1:
					n="";
					tower_A = "";
					n += resultCode.charAt(0);
					for (int i = 0; i < (n.charAt(0)-48); i++) {
						tower_A = tower_A + resultCode.charAt(i+2);
					}
					
					break;
				case 2:
					n="";
					tower_B = "";
					n += resultCode.charAt(0);
					for (int i = 0; i < (n.charAt(0)-48); i++) {
						tower_B = tower_B + resultCode.charAt(i+2);
					}
				
					break;
				case 3:
					n="";
					tower_C = "";
					n += resultCode.charAt(0);
					for (int i = 0; i < (n.charAt(0)-48); i++) {
						tower_C = tower_C + resultCode.charAt(i+2);
					}
				
					break;
				}

				switch (userChoice_B) {
				case 1:
					n=""; 
					m="";
					tower_A = "";
					n += resultCode.charAt(0);
					m += resultCode.charAt(1);
					for (int i = 0; i < (m.charAt(0)-48); i++) {
						tower_A = tower_A + resultCode.charAt(i+2+Integer.parseInt(n));
					}
					
					break;
				case 2:
					n=""; 
					m="";
					tower_B = "";
					n += resultCode.charAt(0); //2
					m += resultCode.charAt(1); //1
					for (int i = 0; i < (m.charAt(0)-48); i++) { // x1
						tower_B = tower_B + resultCode.charAt(i+2+Integer.parseInt(n));
					}							//	0+2(A)+2 = 4 resultCode.charAt(4)
					
					break;
				case 3:
					n=""; 
					m="";
					tower_C = "";
					n += resultCode.charAt(0);
					m += resultCode.charAt(1);
					for (int i = 0; i < (m.charAt(0)-48); i++) {
						tower_C = tower_C + resultCode.charAt(i+2+Integer.parseInt(n));
					}
					
					break;
				}


			
//			승리조건
			if (tower_C.equals("123")) {
				screen(tower_A, tower_B, tower_C, gameLevel);
				System.out.println("승리하였습니다.");
				userInput.close();
				return;
			}
			
		}
		
//		A B C
//		A-> C
//		뭘 확인해야 하나? objectSize > objectSize (0!=objectSize)

//		조건, 최초에는 A = 1,2,3 B = 0,0,0 C=0,0,0
//			다음으로는 이동시켜야한다. (유저의 입력값을 받아서)
//			A 가장 윗 값을 읽어야한다.
//		값을 어떻게 출력시키느냐? 최초출력도 최초의 값을 바탕으로~
//		변수를 쓰는 건 좋은데, 이후로 이 프로그램을 확장 시킬 때
//		값을 유연하게 저장 할 수 있는 방향으로 ~ (==변수 x)
//		 값을 받는데, String towerA = "123" 
//			objectSize 1 objectSize 2 objectSize 3
//		 값을 받는데, @ A 문양을 받게 되면, String towerA = "A23"
//			objectSize A objectSize 2 objectSize 3
//		 값을 어떻게 비교 해야하느냐?
//		 char = ASCII 값으로 첫 값과, 두번째 값과, ~~ 비교하여서	각각의 첫값을 비교
//		 towerA = 13 towerB = 2
		/*
		 * 
		 * 반복문을 사용해서, char nextChar (" ") x2 ("*") == objectSize 0
		 * 
		 * @ == objectSize 1
		 * 
		 * @@@ == objectSize 2
		 * 
		 * @@@@@ == objectSize 3
		 *****
		 * 
		 * * * * == oS = " " *****
		 * 
		 * 
		 */

		/*
		 * TODO
		 * 
		 * char = *
		 * 
		 * 1. 보여주는 로직 (게임의 진행사항 screen) == 일부완성 2. 승리 조건 (C 타워에 크기에 맞게, 타워가 구성되었을 때) 3.
		 * A -> B, 이동 시키는 로직 4. (A < B) || (B!=0) 판별하는 로직 5. 타워에 오브젝트가 들어 왔을 때. 별로 출력하면서
		 * 시각적으로 보일 수 있는 로직 == 완성 ( value == 시각화 ) 6. 시각화의 약속을 정해둘 메소드 == 완성
		 * 
		 */

	}

	public static String moveOrder(String Choice_A, String Choice_B) {
//		이동 요청이 들어왔으니까 크기비교를 해야함.
		String temp = "";
		String resultCode ="";
		
		if ( Choice_B.length() == 0 ) {
			Choice_B = firstValue(Choice_A) + Choice_B; //"1" + "" = "1"
			for (int i = 1; i < Choice_A.length(); i++) {
				temp += Choice_A.charAt(i); //temp == "2" + "3" "23"
				}
			Choice_A = temp;		//choice_A 23 , B 1 
			
			resultCode = Choice_A.length() +""+ Choice_B.length() + Choice_A + Choice_B;
							//2				1					23			1	
			System.out.println("resultCode = " + resultCode);
			
			return resultCode;
		
			} else if (firstValue(Choice_A) < firstValue(Choice_B)) { // 첫자 char로 반환함
			Choice_B = firstValue(Choice_A) + Choice_B;
			for (int i = 1; i < Choice_A.length(); i++) {
				temp += Choice_A.charAt(i);
				}
			Choice_A = temp;
			
			resultCode = Choice_A.length() +""+ Choice_B.length() + Choice_A + Choice_B;
			
			System.out.println("resultCode = " + resultCode);
			
			return resultCode;

		} else {
			System.out.println("이동시킬 수 없습니다.");
			System.out.println("이동시키려는 타워의 오브젝트가 선택한 오브젝트보다 작습니다.");
			
			return"";
		}
	}


//	String 유저의 입력값을 읽어서, 값에 대한 이미지 출력
	public static void screen(String tower_A, String tower_B, String tower_C, int gameLevel) {
		int voidValue1 = gameLevel - tower_A.length(); // 3-3 =0
		int fixValue1 = gameLevel - tower_A.length(); // 3-3 =0
		int voidValue2 = gameLevel - tower_B.length(); // 3-0 =3
		int fixValue2 = gameLevel - tower_B.length(); // 3-0 =3
		int voidValue3 = gameLevel - tower_C.length(); // 3-0 =3
		int fixValue3 = gameLevel - tower_C.length(); // 3-0 =3
		

		//0113 tower_N.charAt(i) 의 조건이 char 형식이라 ASCII 로 변환됐을 것 같아
		//(int) 형변환을 시도하였음.		
		for(int i=0; i<50; i++) {
			System.out.println();
		}
		
//		gameLevel 만큼 줄바꿈을 함
		for (int i = 0; i < gameLevel; i++) { //x3
//			타워의 개수(3)만큼 한 칸을 띄워 타워를 구성함
			for (int j = 0; j < 3; j++) { //x3

				if (j == 0) {
					if (voidValue1 == 0) {
//		 				정상 값 출력
								//	tower_A 23 vV1 ==1 fV1 == 1
								//	i == 0 > 뼈대 출력 vV1 ==0 fV ==1
								//	i == 1 > a == 0 3 -0 ==3
								//	i == 2
						for (int a = 0; a < gameLevel - (tower_A.charAt(i-fixValue1)-48); a++) {
							System.out.print(" ");
						}
								//		a < 1*2-1 == 1 "@"
						for (int a = 0; a < (tower_A.charAt(i-fixValue1)-48) * 2 - 1; a++) {
							System.out.print("@");
						}
								//		a < 3-1 == 2  "  "
						for (int a = 0; a < gameLevel - (tower_A.charAt(i-fixValue1)-48); a++) {
							System.out.print(" ");
						}
					} else {
//		 				뼈대 출력
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						System.out.print("*");
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						voidValue1--; // 3-- == 2;
					}
				} else if (j == 1) {
					if (voidValue2 == 0) {
						for (int a = 0; a < gameLevel - (tower_B.charAt(i-fixValue2)-48); a++) {
							System.out.print(" ");
						}
						for (int a = 0; a < (tower_B.charAt(i-fixValue2)-48) * 2 - 1; a++) {
							System.out.print("@");
						}
						for (int a = 0; a < gameLevel - (tower_B.charAt(i-fixValue2)-48); a++) {
							System.out.print(" ");
						}
					} else {
//		 				뼈대 출력
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						System.out.print("*");
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						voidValue2--;
					}
				} else if (j == 2) {
					if (voidValue3 == 0) {
						for (int a = 0; a < gameLevel - (tower_C.charAt(i-fixValue3)-48); a++) {
							System.out.print(" ");
						}
						for (int a = 0; a < (tower_C.charAt(i-fixValue3)-48) * 2 - 1; a++) {
							System.out.print("@");
						}
						for (int a = 0; a < gameLevel - (tower_C.charAt(i-fixValue3)-48); a++) {
							System.out.print(" ");
						}
					} else {
//		 				뼈대 출력
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						System.out.print("*");
						for (int b = 0; b < gameLevel - 1; b++) {
							System.out.print(" ");
						}
						voidValue3--;
					}
				}
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
		

	}

	public static char firstValue(String Choice_A) {
		char value = Choice_A.charAt(0);

		return value;
	}

}