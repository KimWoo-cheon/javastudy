import java.util.Scanner;

public class Q1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now=sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal=sc.nextInt();
		
		int loss=0;
		int week = 1;
		for(int w= 0; w<goal; w -= loss) {
			week ++;
			System.out.print(week+"주차 감량 몸무게 : ");
			 loss=sc.nextInt();}
		
		System.out.print( 'w' + "달성 축하합니다! ");
		
	}
	

}
