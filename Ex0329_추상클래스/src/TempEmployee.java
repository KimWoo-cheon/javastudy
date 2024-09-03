
public class TempEmployee extends Employee {

	String empno;
	String name;
	int pay;

	@Override
	public int getMoneyPay() {

		return pay / 12;
	}

	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public void print() {
		System.out.println("사번 : "+empno + ", 이름 : " + name + ", 연봉 :" + pay);
	}

}
