package exAbstract;

public class CarMain {

	public static void main(String[] args) {
		
		GasolineCar car1 = new GasolineCar();
		car1.eat();
		car1.run();
		
		
		HybridCar car2 = new HybridCar();
		car2.run();
		car2.iamcar();
		car2.kar();
		
		
		//추상클래스는 객체를 만들 수 없다!
		//추상클래스가 가지고 있는 추상메소드는 구현이 되지 않은 메소드 이기때문
		//객체를 만들더라도 사용불가
//		Car car3 = new Car();
//		car3.
	}

}
