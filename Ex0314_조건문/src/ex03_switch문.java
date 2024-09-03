import java.util.Scanner;

public class ex03_switch문 {

	public static void main(String[] args) {
		
		// switch문 -> 데이터 값을 기준으로 조건을 나누는 조건문!
		
		//숫자 입력시 짝수/홀수를 판단하는 조건!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num%2) {
		case 0: 
			System.out.println("짝수입니다.");
			break;//케이스 영역 종료
		case 1:
			System.out.println("홀수입니다.");
			break;//케이스 영역 종료
		}
	}

}
