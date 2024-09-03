import java.util.Scanner;
import java.util.Random;

public class ex08_plusGame {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			//반복문을 활용한 plus 게임 만들기
			
			//문제가 반복적으로 출력되고 !
			//사용자가 정답을 입력하면
			//정답의 여부를 출력하는 프로그램을 만들기
			
			Random rd = new Random();
			
			String an = "y" ;
			
			while(an.equals("y")) {      /////check.equals("") 문자체크
				int n1=rd.nextInt(10)+1;
				int n2=rd.nextInt(10)+1;
				
				System.out.print(n1+"+"+n2+"=");
			
				int result = sc.nextInt();
			
					if (n1+n2==result){
						System.out.println("Success");
						}
					else {
						System.out.println("Fail");
						System.out.println("계속 하시겠습니까? >>");
						an = sc.next();
					}
		}
	}
}


