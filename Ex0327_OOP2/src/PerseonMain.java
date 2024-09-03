
public class PerseonMain {

	public static void main(String[] args) {

		Person person1 = new Person();
		
//		person1.name="김우천";
//		person1.age=20;
		person1.setName("김우천");
		person1.setAge(20);
		
		Person person2 = new Person("박준한",15);
		
		System.out.println("person1의 이름 : "+person1.getName()+", 나이 : "+person1.getAge());
		System.out.println("person2의 이름 : "+person2.getName()+", 나이 : "+person2.getAge());
		

	}

}
