
public abstract class Employee {
	
	String empno;
	String name;
	int pay;

	// 본인 급여를 계산하는 기능
	public abstract int getMoneyPay();

	public void print() {
		System.out.println("사번 : "+empno + ", 이름 : " + name + ", 연봉 :" + pay);
	}
	public void f() {
		System.out.println("1");
	};

}
