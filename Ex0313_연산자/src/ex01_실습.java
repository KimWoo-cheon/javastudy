import java.util.Scanner;

public class ex01_실습 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//산술 연산자 예제
	//초를 입력 받아 시,분,초 형태로 출력하세요.
		
		
		System.out.print("초 입력:");
		int totalSecond=sc.nextInt();
		
		System.out.print(totalSecond/3600);
		System.out.print("시 ");
		System.out.print(totalSecond%3600/60);
		System.out.print("분 ");
		System.out.print(totalSecond%3600%60);
		System.out.print("초 ");
		
		System.out.print("초 입력:");
		int totalSecond2=sc.nextInt();
		
		int h = totalSecond2/3600;
		int m = totalSecond2%3600/60;
		int s = totalSecond2%60;
		
		System.out.println(h+"시"+m+"분"+s+"초");
		
		
		
		//정수를 입력 받아 홀수인지 짝수인지 판별하는 프로그램
		System.out.print("정수를 입력하세요 : ");
		int a=sc.nextInt();
		String result = a%2==0 ? "짝수" : "홀수";
		System.out.print(a+"는(은)"+result+"입니다");
		
				
		
		
		
		
	}

}
