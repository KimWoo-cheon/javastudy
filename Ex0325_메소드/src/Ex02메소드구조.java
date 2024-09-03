import java.util.Scanner;

public class Ex02메소드구조 {

	public static int cal(int num1, int num2, String op) {

		int result = 0;

		if (op.equals("+")) {
			result = num1 + num2;

		} else if (op.equals("-")) {

			result = num1 - num2;

		} else if (op.equals("*")) {

			result = num1 * num2;

		} else if (op.equals("/")) {

			result = num1 / num2;


		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int num1 =50;
//		int num2=15;
//		String op ="+";
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next();

		System.out.println(cal(num1, num2, op));

	}

}
