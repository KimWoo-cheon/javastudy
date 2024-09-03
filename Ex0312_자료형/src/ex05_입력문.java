import java.util.Scanner;

public class ex05_입력문 {

	public static void main(String[] args) {
		
		
		//입력을 위한 기능 사용하기
		//System.out.println() 출력
		
		// 1.입력을 진행할 수 있는 도구 불러오기! -> Scanner
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("입력:"); 
	    
		// 2. 입력값 입력 받기
		int num = sc.nextInt(); // sc가 가지고 있는 기능중 Int형을 입력할 수 있는 내용을 가져오겠다.
		
		System.out.println("저장된 데이터 : "+num); 
		
		// +) 문자열("")입력하기
		
		System.out.print("이름 입력 : ");
		String word=sc.next();
		System.out.println("저장된 단어 : " + word);
		
		
		
		//System.out.print("결과:"); 
		//System.out.println(num/100*100);
		
		
		
		
		
		
		
		

	}

}
