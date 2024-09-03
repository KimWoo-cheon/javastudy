import java.util.Scanner;

public class ex03_실습 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력 : ");
		int a=sc.nextInt();
		System.out.print("두 번째 정수를 입력 : ");
		int b=sc.nextInt();
		int result = a>=b ? a-b : b-a;
		// result = a-b>0 ? a-b : b-a;
		
		System.out.print("두수의 차 : "+result);
		

	}

}
