
public class CarMain {

	public static void main(String[] args) {
	
		//인터페이스도 객체를 생성할 수 없다!!
		//인터페이스는 구현이 아니라 정의만 되어 있기 때문!
		//Car car1=new Car();
		
		GasolineCar car2 =  new GasolineCar();
		car2.eat();
		car2.stop();
		
		System.out.println("바퀴수 : "+car2.wheelNum);
		System.out.println("창문수 : "+car2.windowNum);
		
		// car2.wheelNum =1; 인터페이스에서 final(상수) 강제적 필드.

	}

}
