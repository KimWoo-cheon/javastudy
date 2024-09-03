import java.util.Scanner;

public class ex04_switch문 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		switch (score/10) {
		
		case 9, 10:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		default:
			System.out.println("D학점 입니다.");
			break;
		
		}

	}

}
