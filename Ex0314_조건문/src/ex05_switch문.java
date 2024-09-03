import java.util.Scanner;

public class ex05_switch문 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		System.out.print(month+"월은 ");
		
		switch (month/3) {
		
		case 0,4:
			System.out.print("겨울");
		break;
		case 1:
			System.out.print("봄");
		break;
		case 2:
			System.out.print("여름");
		break;
		case 3:
			System.out.print("가을");
		break;
	
		}
		System.out.print("입니다!");
	}

}
