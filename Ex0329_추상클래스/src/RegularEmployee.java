
public class RegularEmployee extends Employee{
	
	String empno;
	String name;
	int pay;
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {	
		return pay/12+bonus;
	}
	public void print() {
		System.out.println("사번 : "+empno + ", 이름 : " + name + ", 연봉 :" + pay);
	}
}
