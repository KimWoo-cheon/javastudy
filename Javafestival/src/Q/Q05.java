package Q;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		
		System.out.print("10000원 : ");
		System.out.print(total/10000);
		System.out.println("개");
		
		System.out.print("5000원 : ");
		System.out.print(total%10000/5000);
		System.out.println("개");
		
		System.out.print("1000원 : ");
		System.out.print(total%10000%5000/1000);
		System.out.println("개");
		
		System.out.print("500원 : ");
		System.out.print(total%10000%5000%1000/500);
		System.out.println("개");
		
		System.out.print("100원 : ");
		System.out.print(total%10000%5000%1000%500/100);
		System.out.println("개");

	}

}
