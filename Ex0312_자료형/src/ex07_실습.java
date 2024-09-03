
public class ex07_실습 {

	public static void main(String[] args) {
		
		//삼항 연산자 : 간단한 제어를 처리할 수 있는 연산자
		
		int a = 5;
		int b = 10;
		
		int result = a < b ? b-a : 0;
		System.out.println(result);

		int a2 = 5;
		int b2= 2;
		
		int result2 = a2 < b2 ? b2-a2 : 0;
		System.out.println(result2);
		
		int a3 = 10;
		int b3 = 5;
		
		int result3 = a3 < b3 ? b3-a3 : a3-b3;
		System.out.println(result3);


	}

}
