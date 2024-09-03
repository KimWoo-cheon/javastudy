

//인터페이스 : 프로젝트 설계시 맨 처음 기능과 데이트를 정의(구현x) 하는 용도
//인터페이스는 다중 상속이 가능하다.
public interface Car {
	
	//이터페이스의 변수 생략 키워드 : public static final
	int wheelNum=4; //final이 포함되어있음
	int windowNum=4;
	
//	public void stop() {
//		System.out.println("차량을 정지시키다");
//		
//	}
	
	//인터페이스는 기본적으로 추상 메소드만 지닌다.
	public abstract void stop();
	
	public abstract void eat();


}
