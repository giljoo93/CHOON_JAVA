package _0103;

import java.util.Scanner;

public class ExceotuinStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; //나뉨수
		int divisor; //나눗수

		System.out.println("나뉨수를 입력하세요");
		dividend = scanner.nextInt();
		System.out.println("나눗수를 입력하세요");
		divisor = scanner.nextInt();
		System.out.println(dividend + "를 " 
		+ divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		
	}
}

/* 나뉨수를 입력하세요
100
나눗수를 입력하세요
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at _0103.ExceotuinStudy.main(ExceotuinStudy.java:17)
	*/