
public class Address {
	private String name;
	private int age;
	private String PhoneNumber;
	
	public Address(String name, int age, String PhoneNumber) {
		this.name=name;
		this.age=age;
		this.PhoneNumber=
				PhoneNumber.substring(0,3)+"-"
				+PhoneNumber.substring(3,7)+"-"
				+PhoneNumber.substring(7);
		
	}
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
	}
	public String getPhonNumber() {
		return PhoneNumber;
	}
	public void showAll() {

		System.out.println(name+"("+age+"세) : "+PhoneNumber);
	}
	
//	public static void main(String[] args) {
//		String n = "01029947343";
//				System.out.println(n.substring(0,3));
//				System.out.println(n.substring(3,7));
//				System.out.println(n.substring(7,11));
//				String nn=n.substring(0,3)+"-"+n.substring(3,7)+"-"+n.substring(7,11);
//	
//	System.out.println(nn);
//	}
//
}
