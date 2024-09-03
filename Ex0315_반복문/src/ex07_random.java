import java.util.Random;

public class ex07_random {

	public static void main(String[] args) {
		
		//Random 사용!
		Random rd =new Random();
		
		int num1 = rd.nextInt(10)+1 ;//1~10
		int num2= rd.nextInt(10)+1 ;//1~10
		System.out.println(num1);
		System.out.println(num2);
	}

}
