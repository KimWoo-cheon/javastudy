
public class PiggyBank {

	private int money;
	
	public PiggyBank(int money){
		this.money = money;
	}
	public void showMoney() {
		 System.out.println("현재 잔액은 "+ money+ "입니다.");
	}

	public void withdraw(int outMoney) {
		money=money-outMoney;
		
	}

	public void deposit(int inputMoney) {	
		money=money+inputMoney;
		
	}

	


}
