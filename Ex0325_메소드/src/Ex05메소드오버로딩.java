
public class Ex05메소드오버로딩 {

	public static void add(int num1, int num2) {

		System.out.println("결과 : " + (num1 + num2));
	}

	public static void add(double num1, double num2) {

		System.out.println("결과 : " + (num1 + num2));
	}

	public static void add(String num1, String num2) {

		System.out.println("결과 : " + (num1 + num2));
	}

	public static void main(String[] args) {
		// 두개의 정수를 넘겨받아 더한 결과를
		// 출력하는 add라는 메소드를 만들어서 30+50의 결과를 출력해주세요

		add(30, 50);
		add(3.14, 3.26);
		add("김", "우천");
		System.out.print(" ");

		// 메소드 오버로딩 : 중복정의!
		// 매개변수를 다르게 함으로써 같은 이름의 메소드를 여러개 만들 수 있는 방법!!
		// 
		// 객체지향 : 다형성
	}

}
