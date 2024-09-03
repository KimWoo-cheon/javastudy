import java.util.Scanner;

public class ex03_if_else문 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		//grade 입력 grade가 60점 이상이면 "합격입니다"
		//그렇지 않다면 "불합격입니다"를 출력
		System.out.print("점수를 입력하세요 : ");
		int grade= sc.nextInt();
		
		if(grade>=60) {//if 조건 grade 60점 이상
			System.out.print("합격입니다.");//true면 "합격입니다"출력
		}
		else {
			System.out.print("불합격입니다.");// 거짓이면 "불합격입니다"출력
		}
		
	}

}
