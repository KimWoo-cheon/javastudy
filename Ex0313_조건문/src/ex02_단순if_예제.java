import java.util.Scanner;

public class ex02_단순if_예제 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		//num이 3의 배수이면서 5의 배수라면 "3과 5의 배수입니다"라고 출력
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%3==0) {
			if(num%5==0) {
			System.out.println("3과 5의 배수입니다");
		}
	}
		//num이 3의 배수이면서 5의 배수라면 "3과 5의 배수입니다"라고 출력
	System.out.print("정수를 입력하세요 : ");
	int num2 = sc.nextInt();
				
	if(num2%3==0 && num2%5==0 ) {
	System.out.print("3과 5의 배수입니다");
				}
		
		
	}
}
	

