package dailyStudy;

import java.util.Scanner;

public class _0120 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		

		System.out.println("별로 만든 계단을 몇단으로 구성할까요?");
		int n = userInput.nextInt();

//		
		
/*
//		대표가, 프로그램 만들어야 함 
//	1	    *
//		   **
//		  ***
//		 ****
//		*****

	2	 *
		***
       *****

 	3  *****
 	    ***
 	     *
 	     
 	4    *
 	    ***
 	   *****
 	    ***
 	     *
 	    
 	5    *     *
 		***	  ***
 	   ***** *****  * * *
 	    ***   ***
 	     *     *
		
		
*/
		
		
		star(n);
		
	}
	

	public static void star(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}