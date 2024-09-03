package Q;

public class Q02 {

	public static void main(String[] args) {
		int n=0;
		int result=0;
		
//		while (n !=78) {
//			n++;
//			result +=(78-n)*n;
//		}
		for(int i=1; i<78; i++) {
			result+=i*(78-i);
		}
		System.out.println(result);

	}

}
