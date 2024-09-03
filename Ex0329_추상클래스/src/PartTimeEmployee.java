
public class PartTimeEmployee extends Employee{

	//사번, 이름, 연봉 --> 상위클래스에서 상속 받음
	public PartTimeEmployee(String empno, String name, int pay) {
		
		//super : 상위 클래스
		super.empno=empno;
		super.name=name;
		super.pay=pay;
		
		
	}
	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
