
public class Ex04메소드구조 {
	public static void getDivisor(int num) {
		
		
		String result=" ";
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				result =result+" "+ i;
			}
		}
		System.out.println(num + "의 약수 : "+result);
	}

	public static void main(String[] args) {
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		System.out.println(toDay());
		print();
		
	}
	//매개변수 x, 반환값 o
	public static String toDay() {
		return "0326";
	}
	//매개변수 x, 반환값 x
	public static void print() {
		System.out.println("신나는 화요일");
	}
}
