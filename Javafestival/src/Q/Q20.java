package Q;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int s=0;
		for (int i=1; i<=8; i++) {
			s+=num%10;
			num=num/10;
		}
		System.out.println("합은 "+s+"입니다.");

	}

}
