package dailyStudy;

import java.util.Scanner;

public class _0123_Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10);
		}
		while (true) {
			System.out.println("정렬 방법을 선택하세요.");
			System.out.println("1.내림차순 2.오름차순 3.조회 4.bubbleDESC 5.bubbleASC 0.종료");

			int choice = input.nextInt();
			switch (choice) {
			case 1:
				arrayDesc(intArray);
				break;

			case 2:
				arrayAsc(intArray);
				break;

			case 3:
				show(intArray);
				break;

			case 4:
				bubbleDesc(intArray);
				break;

			case 5:
				bubbleAsc(intArray);
				break;

			case 0:
				System.out.println("종료합니다.");
				return;
			}
		}
	}

//	내림차순 큰 숫자 >> 작은 숫자 정렬
	public static void arrayDesc(int[] intArray) {
		int temp = 0;
		int maxIdx = 0;
		for (int i = 0; i < intArray.length - 1; i++) {
			maxIdx = i;
			for (int j = i + 1; j < intArray.length; j++) {

				if (intArray[maxIdx] < intArray[j]) {
					maxIdx = j;
					}
			}
			temp = intArray[maxIdx];
			intArray[maxIdx] = intArray[i];
			intArray[i] = temp;		

		}
		System.out.println("내림차순 정렬되었습니다.");
	}

	public static void arrayAsc(int[] intArray) {
		int temp = 0;
		int minIdx = 0;
		for (int i = 0; i < intArray.length - 1; i++) {
			minIdx = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[minIdx] > intArray[j]) {
					minIdx = j;
				}
			}
			temp = intArray[minIdx];
			intArray[minIdx] = intArray[i];
			intArray[i] = temp;
		}
		System.out.println("오름차순 정렬되었습니다.");
	}

	public static void bubbleDesc(int[] intArray) {
		int temp = 0;
		boolean run = true;
		for (int i = 0; i < intArray.length - 1; i++) {
			run = true;
			for (int j = intArray.length - 1; j > i; j--) {
				if (intArray[j] > intArray[j - 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j - 1];
					intArray[j - 1] = temp;
					run = false;
				}
			}
			if (run == true) {
				break;
			}
		}
		System.out.println("버블내림차순 정렬되었습니다.");
	}

	public static void bubbleAsc(int[] intArray) {
		int temp = 0;
		boolean run = true;
		for (int i = 0; i < intArray.length - 1; i++) {
			run = true;
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
					run = false;
				}
			}
			if (run == true) {
				break;
			}
		}
		System.out.println("버블오름차순 정렬되었습니다.");
	}

	public static void show(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
