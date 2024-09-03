package for문;

import java.util.Scanner;

public class EX05for문 {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	//정수 입력 : 32
	//32의 약수 : 1 2 4 8 16 32
	//약수 : 자기 자신을 나누어 떨어지게 하는 수
	System.out.print("정수 입력 : ");
	int s=0;
	int num = sc.nextInt();
	for (int i=1; i<=num; i++) {
		if (num%i==0) {
			System.out.print(i+" ");
			s+=i;
		}
	}
	System.out.println( "");
	System.out.println( num +" 약수의합 : " +s);
	
	
	
}

}
