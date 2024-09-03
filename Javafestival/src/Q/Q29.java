package Q;

import java.util.Scanner;
public class Q29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("N 입력 >> ");
		int N= sc.nextInt();
		System.out.print("X 입력 >> ");
		int X= sc.nextInt();
		String r="";
		for (int i=1; i<=N; i++) {
			System.out.print(i+"번째 정수 입력 >> ");
			int num= sc.nextInt();
			if (num<X) {
				r=r+" "+num;			
			}
		
			
		}
		System.out.print("결과 >> "+r);

	}

}
