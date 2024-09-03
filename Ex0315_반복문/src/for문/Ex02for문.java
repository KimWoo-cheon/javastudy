package for문;

public class Ex02for문 {

	public static void main(String[] args) {
		
		//1) for문을 사용하여 10에서 1까지 출력하시오.
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("");
		
		//2) for문을 사용하여 21에서 57까지 출력하시오.
		for (int i = 21; i<=57 ; i++ ) {
			System.out.println(i);
			
			}
		System.out.println("");
		
		//3) 96-53
		for (int i = 96; i>=53 ; i-- ) {
			System.out.println(i);}
		System.out.println("");
		
		
		//4 21-57 홀수
		for (int i = 21; i<=57 ; i++) {
			if(i%2==1) {
			System.out.println(i);}
			}
		System.out.println("");
		
		
		// build up !
		// 21 ~ 30까지의 수중 짝수만 출력하자
		
		//5) 1~100까지의 수중 3의 배수이면서 5의 배수출력
		for (int i= 1; i<=100; i++ )
		{
			if (i%15==0) {
				System.out.println(i+" ");
				
			}
		}
		System.out.println("");
		
		for (int i= 1; i<=100; i++ )
		{
			if (i%5==0 & i%3==0) {
				System.out.println(i+" ");
			}
		
	}

	}}

