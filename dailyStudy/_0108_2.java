package dailyStudy;

import java.util.Scanner;

public class _0108_2 {

	/*
	 * 
	 * if ( 조건식 ) 내용(참일 때 실행 할 내용);
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("도서관리 프로그램입니다.");
		System.out.println("메뉴를 선택해주세요. (1)~(3)");
		System.out.println("1.대여하기 2.반납하기 3.조회하기");
		int choice = scanner.nextInt();
	
		switch(choice) {
			case 1: 
				System.out.println("1.대여하기");
				break;
							
			case 2:
				System.out.println("2.반납하기");
				break;
				
			case 3:
				System.out.println("3.조회하기");
				break;
				
			default:
			}
		

			
				
		//Multiple markers at this line
		//- Syntax error on token ")", delete this token
		//- The left-hand side of an assignment must be a variable
		
		

		scanner.close();
	}

}
