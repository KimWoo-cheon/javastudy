package Q;
import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int t = sc.nextInt();
		int wage = 5000*t ;
		if (t>8) {
			 wage += (t-8)*5000*0.5 ;
		}
		System.out.print("총 임금은 "+wage+ " 입니다.");

	}

}
