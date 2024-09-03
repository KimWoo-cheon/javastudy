import java.util.Scanner;
public class ex04_while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int result=0;
		while(num != -1) {
		System.out.print("정수 입력 : ");
		num=sc.nextInt();
		result +=num;
		System.out.println("누적결과 : "+result);}
		
		System.out.print("종료되었습니다.");
	}

}
