import java.util.Scanner;

public class ex06_switch문2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		//조건문의 어느상황에서든 사용할 수 있는 변수 선언! -> 전역 변수
		String ssn="없음";
		
		switch (month/3) {
		case 0,4:	
			ssn = "겨울";
		break;
		case 1:		
			ssn = "봄";
		break;
		case 2:		
			ssn = "여름";
		break;
		case 3:	
			ssn = "겨울";
		break;
		
	
		}//switch문이 끝나는 영역!
		System.out.print(month+"월은 "+ssn+"입니다.");
	}

}
