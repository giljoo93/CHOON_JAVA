package dailyStudy._0117;

public class Car {

	String color;
	int speed;
	
	void drive() {
		System.out.println("차가 달립니다!");
	}
	
	Car() {
		color = "White";
		speed = 0;
		System.out.println("기본 자동차 생성");
	}
	
	Car(String c) {
		color = c;
		speed = 0;
		System.out.println(color + " 자동차 생성");
	}
	
	Car(String c, int s) {
		color = c;
		speed = s;
		System.out.println(color + " 자동차 생성, 속도 : " + speed);
	}
	
	
	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car("Red");
		Car c3 = new Car("Blue", 100);
		
		

	}
	
}

