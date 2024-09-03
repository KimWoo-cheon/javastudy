import java.util.Scanner;

public class ex02_while문 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		while(true) {
			System.out.print("정수 입력:");
			int num = sc.nextInt();
			
			if(num > 10) {
				System.out.println("종료되었습니다!");
				break;// 반복문을 빠져나가는 키
			}
			
		}
		
	}

}
