import java.util.Scanner;

public class ex06_예제 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// import 단축키 Ctrl + Shift + F5
	    System.out.print("정수 입력 : "); 
	    int num = sc.nextInt(); // 변수 num 생성
	    int result = num/100*100; // 100의자리 밑으로 버려버리기 result 
		System.out.print("결과 값 : "); 
		System.out.println(result); //결과출력
		
		//3 4 5 5 5 4 3 3
		// T F T F
	}

}
