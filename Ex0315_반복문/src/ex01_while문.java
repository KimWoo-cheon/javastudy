import java.util.Scanner;

public class ex01_while문 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.정수 입력
		System.out.print("정수 입력 : ");
		
		
		int num = sc.nextInt();
		
		while(num<10){
			System.out.print("정수 입력 : ");
			 num = sc.nextInt();
		}
		System.out.print("종료되었습니다.");
		
		
}

}
