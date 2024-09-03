
public class phonemain {

	public static void main(String[] args) {
		// 객체지향 프로그래밍
		// : 객체들의 모임으로 프로그램을 개발하는 기법
		// 객체 : 각각의 역할에 맞게끔 데이터와 기능을 가지고 있는 것!
		// 클래스 : 객체를 만드는 방법
		
		int num=30;
		String name="승환";
		String name2="임승환";
		
		//Phone() : 생성자(method)
		//			: Phone클래스를 불러와서 객체를 만드는 기능
		//			: default 생성자 
		Phone myPhone=new Phone(); 
		System.out.println(myPhone.number);
		
		//휴대폰을 사용하고 싶을때!
		//new : 공간 생성
		//phone() : phone 클래스 만큼의 공간을 가져온다(생성자)
		Phone p3 = new Phone("01023784747","LG","iPhone");
		System.out.println(p3.number);
		
		Phone p4 = new Phone();	
		
		Phone p1 = new Phone();
		//전화번호 출력
		System.out.println(p1.number);
		System.out.println(p1.kind);
		p1.call();
		
		//수현쌤 휴대폰 만들기
//		Phone p2 = new Phone();
//		p2.number="010123456789";
//		p2.telecom="LG";
//		p2.kind="iphone";
//		System.out.println(p2.number);
		
		Phone p3 = new Phone("01023784747","LG","iPhone");
		System.out.println(p3.number);
		
		Phone p4 = new Phone();
		
		
	}

}
