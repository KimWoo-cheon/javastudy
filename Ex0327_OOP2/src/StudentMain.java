
public class StudentMain {

	public static void main(String[] args) {
	
		
		//학생 데이터를 사용
		//student1
		Student student1 = new Student();
		student1.name = "승환";
		student1.number = "01047681580";
		student1.age = 20;
		student1.scoreJava = 80;
		student1.scoreAndroid =100;
		
		//수현 이라는 학생 만들기
		Student student2 = new Student();
		student2.name = "수현";
		student2.number = "01047681580";
		student2.age = 22;
		student2.scoreJava = 80;
		student2.scoreAndroid =100;
		
		Student student3 = new Student("홍길동","20150675",22,50,89,77);
		Student student4 = new Student("김영희","2009054",29,90,25,30);
		
		student2.show();
		student3.show();
		student4.show();
		

	}

}
