package Q;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int result = 1;
		for (int i=1; i<=num; i++)
		{
			result = result * i;
	}
		System.out.print("출력 : "+result);


	}

}
