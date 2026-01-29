package dailyStudy;

public class _0124_test {

	public static void main(String[] args) {
		
		int[] ArrA = {1,2,3};
		int[] ArrB = ArrA;
		
		System.out.println("A = " + ArrA[0]);
		System.out.println("B = " + ArrB[0]);
		
		ArrA[0] = 3; 
		
		System.out.println("A = " + ArrA[0]);
		System.out.println("B = " + ArrB[0]);
		
	}
}
