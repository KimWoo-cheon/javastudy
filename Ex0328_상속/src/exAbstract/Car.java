package exAbstract;

//추상클래스 : 추상메소드를 하나 이상 가진 클래스
//			: 자식클래스에게 강제성(추상메소드)을 부여해 줄 수 있는 클래스
public abstract class Car extends OriginalCar {
	
	//추상메소드 --> 자식에서 반드시 구현해야만 하는 메소드
	public abstract void eat() ;
	
	public void run() {
		System.out.println("달린다");}
		
		
	public abstract void kar();
			

}
