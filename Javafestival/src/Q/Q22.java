package Q;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int i;
		String s="";
		for (i=1; i<=10;) {
		
		System.out.print(i+"번째 정수 입력 ");
		int num = sc.nextInt();
		if (num%3==0)
	
		{
			s=s+" "+num;
			
		}
		i++;
		}
	System.out.println("3의 배수 : "+s);
	
	}
}
