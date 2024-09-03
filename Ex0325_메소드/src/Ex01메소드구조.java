
public class Ex01메소드구조 {
	
	//void 반환이 없다!!
	public static void main(String[] args) {
		System.out.println("test");
		int number = 10;
		System.out.println(number);
		
		int num1=10;
		int num2=20;		
		add(num1,num2);
		System.out.println(add(num1,num2));
		//메소드 호출 -> 반환값이 있다면 호출된 위치로 반환 된다.!		
		
		num1=3; num2=5;
		
		int addNum= add(3,5);
		int minusNum=minus(3,5);
		int mulNum = mul(3,5);
		int divNum = div(3,5);
		System.out.println("더하기 결과 : " + addNum);
		System.out.println("빼기 결과 : " + minusNum);
		System.out.println("곱하기 결과 : " + mulNum);
		System.out.println("나누기 결과 : " + divNum);
		
		
	}
	//메소드 : 기능을 따로 만든다
	//public : 접근 제한자 --> 접근허용 범위(public, private, default, protected)
	//static : 공유하다	
	//int : 반환타입지정
	//add : 메소드 이름
	public static int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	public static int minus(int num1, int num2) {
		int minus = num1-num2;
		return minus;
	}
	
	 public static int mul(int num1, int num2) {
		 int mult= num1*num2;
		 return mult;
	 }
	 public static int div(int num1, int num2) {
		 int div=num1/num2;
		 return div;
	 }

}
