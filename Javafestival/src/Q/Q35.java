package Q;
import java.util.Random;
import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		Random rd =new Random();
		Scanner sc = new Scanner(System.in);
			
		int result;
		int f=0;
			
			while(f !=5 ){ 
				
				int num1 = rd.nextInt(10)+1 ;//1~10
				int num2= rd.nextInt(10)+1 ;//1~10
			{System.out.print(num1+" + "+num2 +"=");
			result = sc.nextInt();
			if (result == num1+num2 ) {
				System.out.println("SUCCESS!");
			}
			else {
				System.out.println("Fail...");
				f +=1;}
			
			}
				
			
			}
			System.out.println("GAME OVER!");
	}

}
