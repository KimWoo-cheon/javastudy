import java.util.Scanner;

public class ex03_while {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		boolean isOk = true;
		while(isOk) {
			System.out.print("정수 입력:");
			int num = sc.nextInt();
			
			if(num > 10) {
				System.out.println("종료되었습니다!");
				isOk=false;// 반복문을 빠져나가는 키
			}
			
		}
		
	}

}
