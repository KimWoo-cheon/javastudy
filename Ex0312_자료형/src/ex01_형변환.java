
public class ex01_형변환 {

	public static void main(String[] args) {
	
		// 형변환 : 데이터의 자료형태를 변경하는 기술!
		
		
		int num1 = 4;       // 4byte
		double num2 = 4.12; // 8byte
		
		// 1. 자동(묵시적) 형변환 : 작은데이터를 큰 데이터 공간으로 변경하는것 !
		num2 = num1;
		
		// 2. 강제(명시적) 형변환 : 큰 데이터를 작은 데이터에 담기 위해 크기를 강제적으로 변경하는 것
		num1 = (int) num2;
		
		
		
	}

}
