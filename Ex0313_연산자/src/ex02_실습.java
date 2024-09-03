import java.util.Scanner;

public class ex02_실습 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//정수를 입력 받아 홀수인지 짝수인지 판별하는 프로그램
		System.out.print("정수를 입력하세요 : ");
		int a=sc.nextInt();
		String result = a%2==0 ? "짝수" : "홀수";
		System.out.print(a+"는(은) "+result+"입니다.");
	}

}
