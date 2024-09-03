package Q;

public class Q04 {

	public static void main(String[] args) {

		int n=+1;
		int sum = 0;
		for(int num=1; num<101; num ++ ) {
		
			System.out.print((num * n)+" ");
			sum += (num * n) ;
			n=(-1)*n;
			
		}
		
		System.out.println("");
		System.out.print("결과 : "+sum);
		

	}

}
