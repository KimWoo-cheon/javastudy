package Q;

import java.util.Scanner;

public class Q21 {

	public static int cal(int num1, int num2, char op) {

		int result = 0;

		if (op == '+') {
			result = num1 + num2;

		} else if (op == '-') {

			result = num1 - num2;

		} else if (op == '*') {

			result = num1 * num2;

		} else if (op == '/') {

			result = num1 / num2;

		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num1 =50;
//		int num2=15;
//		char op ='-';
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char op = sc.next().charAt(0);

		System.out.println(cal(num1, num2, op));
	}

}
