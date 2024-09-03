import java.util.Scanner;
public class Ex03메소드구조 {

	public static int LagerNumbers(int num1, int num2) {
		int L=0;
		
		if (num1>num2) {
		L= num1;}
		else if(num2>num1) {
			L = num2;
		}
		else {
			L=0;}
		return L;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int result =LagerNumbers(num1,num2);
		System.out.println("큰 수 확인 : "+result);

	}

}
