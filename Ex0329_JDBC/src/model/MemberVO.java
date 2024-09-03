package model;

public class MemberVO {
	
	// VO(Value Object) : 값 자체를 나타내는 객체
	// 회원 클래스
	
	// 필드(회원의 정보)
	private String id; //(private, protected, public, default)
	private String pw;
	private String name;
	private int age;
	
	// 생성자 메소드 : 객체를 호출할 때 자동으로 실행 되는 메소드
	// -이름이 클래스 이름과 같다
	// -return 타입이 없다. void도 사용하지 않음
	// -오버로딩(중복정의)이 된다.
	
	//객체 생성할 때 필드의 값을 초기화할 생성자 메소드
	public MemberVO(String id, String pw, String name, int age) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.age=age;
		
	}
	public MemberVO(String id, String pw) {
		this.id=id;
		this.pw=pw;
		
	}
	// Getter : 회원의 필드 정보를 가지고 오기 위한 메소드
	// Setter :  회원의 필드에 정보를 저장하기 위한 메소드

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
