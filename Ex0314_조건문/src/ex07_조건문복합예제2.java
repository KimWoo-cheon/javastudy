import java.util.Scanner;

public class ex07_조건문복합예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		
		System.out.println("1.콜라(1200원) 2.밀크티(2500원) 3.우유(500원)");
		
		System.out.print("메뉴를 선택하세요 : ");
		int menu = sc.nextInt();
		
		int price;
		int change = 0;
		if(menu<=3 && menu>=1) {
			
			if(menu == 1) {
				price=1200;
				 change = money - price;}
				else if (menu==2) {
					price=2500;
					 change = money - price;}
					else if(menu==3){
						price=500;
					 change = money - price;
					}
			if(change<0) {
				System.out.println("돈이 부족해요 ㅜㅜ");
				System.out.println("잔돈 : " + money);
				System.out.print("천원 : " + money/1000 + "개 오백원 : "
										+ money%1000/500 + "개 백원 : "
										+ money%1000%500/100+"개");}
				else {
					System.out.println("잔돈 : " + change);
					System.out.print("천원 : " + change/1000 + "개 오백원 : "
											+ change%1000/500 + "개 백원 : "
											+ change%1000%500/100+"개");
					}}
			else {
				System.out.print("없는 메뉴입니다.");
			}
		}
	}
	
		


