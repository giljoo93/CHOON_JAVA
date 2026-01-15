package dailyStudy;

public class _0114 {

//	유튜브 보다가 부트캠프 강의가 있길래. 문제 따라서 만들어 봄
//	2차원 배열 선언하고 루프문을 이용하여서 1~5, 11~15, 101~105 출력하기
	
	public static void main(String[] args) {
		
		int[][] numberArray;
		numberArray = new int[3][5];
		int k =0;
		for(int i=0; i<numberArray.length; i++) {
			for (int j=1; j<=numberArray[i].length; j++) {
				if(k==1) {
					k=0;
				}
				numberArray[i][j-1] = j+k;
			}
			if(k==0) {
				k=1;
			}
			k=k*10;
		}
		
		for(int i=0; i<numberArray.length; i++) {
			for (int j=0; j<numberArray[i].length; j++) {
				System.out.println(numberArray[i][j]);		
			}
			
		}
		
		
	}
}
