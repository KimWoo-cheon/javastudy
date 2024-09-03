
public class ex03_연산자 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=7;
		
		//float 형태의 데이터를 담을 수 있는 num3 10.0
		//float 형태의 데이터를 담을 수 있는 num4 7.0
		float num3 = 10.0f;
		float num4 =7.0f;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num1/num2);// 정수, 정수 -> 정수
		System.out.println(num3/num4); // 실수,실수 -> 실수
		System.out.println(num1/num4); // 정수,실수 -> 형변환문제가 발생할 수 있다.
		
				 
	}

}
