package Q;
import java.util.Scanner;

public class Q16 {
	public static boolean isdivide(int num1, int num2) {
		boolean isdivide= num1%num2 ==0;
		return isdivide;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean result=isdivide(num1,num2);
		System.out.println("결과확인 : "+result);
		
		
	}

}
