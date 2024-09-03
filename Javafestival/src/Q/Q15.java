package Q;

public class Q15 {
	public static String getMiddle(String A) {
		
		String result=" ";
		int l=A.length();
		if(l%2==0) {
			result=	A.substring(l/2-1 ,l/2+1);
				
			}
		if(l%2==1) {
			result=	A.substring(l/2,l/2+1);
				
			}
		return result;
	}
	public static void main(String[] args) {


		System.out.println(getMiddle("abced"));
		System.out.println(getMiddle("test"));

	}

}
