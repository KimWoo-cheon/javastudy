import java.util.Scanner;

public class ex06_for문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int odd = 0; //홀
		int even = 0; // 짝
		int num = 0;
		while(num!=-1) {
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		if (num%2==0) {
			even ++;
		}
		else if (num%2==1) {
			odd ++;
			}
		System.out.println("짝수개수 : "+even);
		System.out.println("홀수개수 : "+odd);
		}
		System.out.print("종료되었습니다.");
	}

}
