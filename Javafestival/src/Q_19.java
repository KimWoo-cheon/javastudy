import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		
	Scanner sc =  new Scanner(System.in);
	

	System.out.print("n 입력 : ");
	int n = sc.nextInt();
	int a =1;
	for (int i = 1; i<=n; i++) {
		System.out.print(a+" ");
		a=a+i;
	}
	}

}
