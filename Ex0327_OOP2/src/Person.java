
public class Person {

	private String name;
	private int age;

	//생성자 오버로딩
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//	}
	
	public Person() {
		
	}
	
	
	
	
		// source - generate getter , setter --> 자동생성/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
}
