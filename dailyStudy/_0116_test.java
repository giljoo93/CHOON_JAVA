package dailyStudy;

public class _0116_test {
	
	public static void main(String[] args) {
		int[] numbers = {5, 3, 8, 4, 2, 6, 11, 5};
		
		System.out.print("원본 배열 : ");
		printArray(numbers);
	
		bubbleSortAscending(numbers);
		System.out.print("오름차순 : ");
		printArray(numbers);
		
		bubbleSortDescending(numbers);
		System.out.print("내림차순 : ");
		printArray(numbers);
		
	}
	
//	내림차순
	public static void bubbleSortAscending(int[] array) {
		for(int i=0; i< array.length -1; i++) {
			for(int j=0; j < array.length -i -1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
//	오름차순
	public static void bubbleSortDescending(int[] array) {
		for(int i = 0; i < array.length -1; i++) {
			for(int j =0; j < array.length -i -1; j++) {
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] array) {
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
