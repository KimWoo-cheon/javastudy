package Q;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		String str1= sc.next();
		int n1 = str1.length();
		int num1 = Integer.parseInt(str1);
		int div=1;
		int result=0;
		int ex=1;
		for (int i=1; i<=n1; i++) {
			result += ((num1/div)%(10))*ex;
			div=div*10;
			ex=ex*2;
//			System.out.println(result);
		}
		System.out.println(str1+"(2) = "+result+"(10)");
		
		
		
			

	}

}
