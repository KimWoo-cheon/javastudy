import java.util.Scanner;

public class ex01_단순if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// age 변수의 값이 20보다 크거나 같다면 -> "성인입니다" 출력
		// 해당하지 않는다면 어떤처리?
		System.out.print("나이를 입력하세요 : ");
		int age=sc.nextInt();
		if(age>=20) {
			System.out.println("성인입니다");
			System.out.println("반갑습니다");
		}
		
		System.out.println("프로그램 끝");
		//else {
		//	System.out.print("성인이 아닙니다");
		//}
		
		
		
	}

}
