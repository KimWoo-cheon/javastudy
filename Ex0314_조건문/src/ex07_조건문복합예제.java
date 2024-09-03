import java.util.Scanner;

public class ex07_조건문복합예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.금액 입력
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		//2.메뉴
		System.out.println("1.콜라(1200원) 2.밀크티(2500원) 3.우유(500원)");
		int menu = sc.nextInt();
		
		//3.잔돈
		int change = 0;
		//선택 메뉴의 금액 변수
		int data=0;
		if(menu == 1) {
			data=1200;
			 change = money - data;}
			else if (menu==2) {
				data=2500;
				 change = money - data;}
				else {
					data=500;
				 change = money - data;
				}
		if(money<data) {
			System.out.println("돈이 부족해요 ㅜㅜ");
			System.out.print("잔돈 : " + money);}
			else {
				System.out.print("잔돈 : " + change);
		}
		
			}
		
	}


