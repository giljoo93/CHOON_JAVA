package dailyStudy._0128;

public class Tool {

	public static void clearScreen() {
		for(int i =0; i<50; i++) {
			System.out.println();
		}
	}
	
	
	public static void extendBookSize(Book[] bookList) {
		
		int isfull = 0;
		int mustExtend =0;
		int extendSize = 100;
		
		for (int i =0; i < bookList.length; i++) {
		
			if (bookList[i] != null) {
//				System.out.println("여유 공간이 없음");
				isfull ++;
			}
			
			if (isfull > bookList.length*0.9) {
				mustExtend ++;
				break;
			}
			
		}
		
		for (int i = 0; i < mustExtend; i++) {
			
			extendSize = extendSize *10;
		}
		
		bookList = new Book[extendSize];
	}
	
}
