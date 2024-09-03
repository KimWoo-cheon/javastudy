
//인터 페이스를 상속 받을때는 implements로 상속받는다
public class GasolineCar implements Car, Car2{
	
	@Override
	public void eat() {
		System.out.println("휘발유를 먹다");
		
	}

	@Override
	public void stop() {
		System.out.println("휘발유 차가 멈추다");
		
	}

	@Override
	public void run() {
		System.out.println("달려라");
		
	}

}
