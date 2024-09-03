package exCasting;

public class Pocket {

	public static void main(String[] args) {
		
		Pica pica= new Pica();
		pica.pick();
		// 오버로딩한 메소드를 하위 객체에서 사용시 재정의된 내용으로 실행 되어 진다.
		
		
		//자식클래스 객체에서 상위클래스로 형변환후 오버로딩한 메소드를 사용한다면
//		Doll doll = pica;
//		doll.pick();//?
		
		//자식클래스 객체에서 상위클래스로 형변환후 오버로딩한 메소드를 사용한다면 자식클래스에서 재정의한 내용으로 실행 되어진다.
		
		//업 캐스팅 -> 자식 클래스에서 부모 클래스로 형변환 시키는 방법
		//상위 클래스 객체 하나로 하위 클래스 객체들을 전부 다룰 수 있다.
		//주의1. 자식클래스에 추가로 작성한 데이터와 기능은 사용할 수 없다.
		//주의2. 단 자식클래스에 오버라이딩한 경우는 자식 클래스 기능을 사용한다.
		
		
		Chico chico = new Chico();
		Zam zam = new Zam();
		
		machine(pica);
		machine(chico);
		machine(zam);

		Doll doll =new Doll();
		machine(doll);
	}
	//오버로딩된 메소드는 업캐스팅 하더라도 하위클래스에 있는 기능을 사용하기 때문에
	//상위클래스 객체로 하여금 하위클래스 객체를 한번에 다룰 수 있다.
	public static void machine(Doll doll) {
		doll.pick();
	}
	
//	public static void machine(Pica pica) {
//		pica.pick();
//	}
//	public static void machine(Zam zam) {
//		zam.pick();
//	}
//	public static void machine(Chico chico) {
//		chico.pick();
//	}

}
