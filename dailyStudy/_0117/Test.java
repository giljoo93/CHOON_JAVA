package dailyStudy._0117;

public class Test {

	int x;
	
	Test(int a) {
		x = a;
	}
	
	
	public static void main(String[] args) {
		Test t1 = new Test(5);
		Test t2 = new Test(10);
		System.out.println(t1.x +t2.x);
	}
}
