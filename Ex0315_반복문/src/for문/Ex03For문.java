package for문;

import java.util.Scanner;

public class Ex03For문 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		// 문제1
		// 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하세요.
		
		//숫자를 입력하세요>>
		System.out.print("숫자를 입력하세요 >>>> ");
		int num = sc.nextInt();
		for (int i=1; i<=10; i++)
		{
			System.out.print(num*i+" ");
		}
	}

}
