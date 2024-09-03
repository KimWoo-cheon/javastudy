import java.util.Scanner;

public class ex01_다중if문 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		if (totalScore>=90) {
			System.out.print("A");}
			else if (totalScore>=80) {
				System.out.print("B");}
				else if (totalScore>=70) {
					System.out.print("C");}
					else {
						System.out.print("D");
					} System.out.println("학점 입니다!");
					
					
					
					if (totalScore>=90) {
						System.out.print("A");}
						 if (totalScore>=80 && totalScore<90) {
							System.out.print("B");}
							 if (totalScore>=70 && totalScore<80) {
								System.out.print("C");}
								if (totalScore<70
									){
									System.out.print("D");
								} System.out.println("학점 입니다!");
					
		
				}
		
	}

