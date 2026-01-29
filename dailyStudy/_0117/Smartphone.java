package dailyStudy._0117;

public class Smartphone {

	String brand;
	String model;
	int storage;
	boolean has5G;
	
	Smartphone(String brand, String model, int storage, boolean has5G) {
		this.brand = brand;
		this.model = model;
		this.storage = storage;
		this.has5G = has5G;
	}
	
	Smartphone(String brand, String model) {
		this(brand, model, 128, true); // 128GB , 5G = true;
	}
	
	Smartphone(String brand) {
		this(brand, "Standard"); // 모델 = Standard
	}
	
	Smartphone() {
		this("Generic"); //brand = Generic
	}
	
	void showSpecs() {
		System.out.println("브랜드: " + brand);
		System.out.println("모델: " + model);
		System.out.println("저장용량: " + storage);
		System.out.println("5G : " + has5G);
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone();
		Smartphone s2 = new Smartphone("Samsung");
		Smartphone s3 = new Smartphone("Apple", "IPhone 15");
		Smartphone s4 = new Smartphone("Google", "Pixel 8", 256, false);
		
		s1.showSpecs();
		s2.showSpecs();
		s3.showSpecs();
		s4.showSpecs();
		
	}
	
}
