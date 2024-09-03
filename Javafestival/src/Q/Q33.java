package Q;
import java.util.Scanner;

public class Q33 {

	public static int powerN(int num1, int num2) {
		int result=num1;
		for(int i=1; i<num2; i++) {
			result*=num1;
		}
		return result;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int n = sc.nextInt();
		int result=powerN(base,n);
		System.out.println("결과확인 : "+result);
	}

}
