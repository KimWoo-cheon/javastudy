
public class ex04_문자열더하기 {

	public static void main(String[] args) {

		// 문자 + 문자 = 문자
		String num1 = "10";
	    String num2 = "7";
	    
	    System.out.println(num1+num2);
		
	    int num3 = 10;
	    String num4 = "7";
	    int num5 = 8;
	    System.out.println(num3+num4+num5);
	    System.out.println(num3+num5+num4);
	    System.out.println(num4+num5+num3);
	    // 문자는 연산이 불가능, +연산으로 연결만 가능
	    
	    String a= 10+7+"1";
	    String b= 8+"1"+2;
	    String c="1"+5+2;
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	    
	    
	    
		
		
		
	}

}
