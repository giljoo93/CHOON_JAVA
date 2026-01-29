package dailyStudy._0117;

public class Circle {
	int radius;

	//생성자
	Circle(int r) {
		radius = r; //객체가 생성되며, radius 값 초기화
		
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}


	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println(c.getArea());
	
		
	}

}
