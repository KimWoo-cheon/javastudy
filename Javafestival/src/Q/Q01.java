package Q;
import java.util.Scanner;
public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now=sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal=sc.nextInt();
		
		int week=1;
	
	
//		while(now>goal) {
//			
//			
//			System.out.print(week+"주차 감량 몸무게 : ");
//			now-=sc.nextInt();
			week ++;
//		}
//		
//		System.out.print(now+"kg 달성!! 축하합니다!");
		
		for (int i=0; i<week; i++) {
			
			System.out.print(week+"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			now=now-minus;
			week++;
			if(now<goal) {
				System.out.println(now+"kg 달성!! 축하합니다");
				break;
			}
			
		}
	}

}
