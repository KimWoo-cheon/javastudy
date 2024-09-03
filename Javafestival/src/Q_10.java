import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.print("행 개수 : ");
		 int num = sc.nextInt();
		 int i;
		 int n;
		 for (i=num; i>0; i--)
		 {
		 	for( n=0; n<i; n++) 
		 {
		 		System.out.print("*");
		 		
		 		} 
		 	 System.out.println("");
		 	
		 	}

	}

}
