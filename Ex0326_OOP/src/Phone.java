
public class Phone {
	//클래스 : 객체를 만드는 방법
	//		: 현실세계에 있는 물체를 표현할 수 있는 사용자 임의 자료형
	
			// 휴대폰
			// 번호, 통신사, 기종
			// 필드 --> 클래스에서 data
			// 추상화 : 공통된 특징을 뽑아내는 기법
			// 캡슐화 : 추상화로부터 뽑아진 내용들을 한번에 묶을 수 있는 기법
			// 		: 다른 곳에서 쉽게 접근 할 수 없게 감출 수 있다.(정보은닉)
			
	// 휴대폰
	// 번호, 통신사, 기종
	// 필드 --> 클래스에서 data
	
	
	//접근 제한자
	//private : 현재 클레스에서만  접근 가능 하게끔 허용
	//protected : 같은 패키지 또는 자식클래스에서 접근 가능하게끔 허용하겠습니다.
	//public : 전부다 접근 가능하게끔 허용하겠습니다.
	//default : 같은 패키지에서만 허용하겠습니다.
				//보통 패키지는 역할군으로 분류함.
		private	 String number;
			 String telecom;
			 String kind;
	//생성자 : 클래스 만큼의 공간을 만들어내는 기능
//			 객체를 생성하는 기능
//			 특징 1 반환 타입 자체가 없다
//			 특징 2. 생성자 이름은 클래스 이름과 동일하다.
			 
			 
			 //사용자 임의 default 생성자 생성하기
			 
			 
			 
	public phone() {
		
	}
			//전화 걸기,문자보내기,사진 찍기, 사진 보기, 게임 하기,시간 확인
		//사용자 임의 생성자 생성
	public Phone(String number, String telecom, String kind) {
		//this : 현재 클래스
		this.number=number;		
		this.telecom=telecom;
		this.kind = kind;
	}
	public void call() {
		System.out.println("전화를 걸다");
	}
	public void sendMessage() {
		System.out.println("문자를 보내다");
	}
	public void camera() {
		System.out.println("사진을 찍다");
	}
	
	public static void main(String[] args) {
		
	 

	}

}
