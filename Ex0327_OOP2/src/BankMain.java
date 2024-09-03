
public class BankMain {

	public static void main(String[] args) {
		
		//승환쌤 저금통을 만들어주세요!
		PiggyBank bank1 = new PiggyBank(1000);
		bank1.showMoney();
		
		//수현쌤 저금통을 만들기 초기값 10000
		PiggyBank bank2 = new PiggyBank(10000);
//		bank2.showMoney();
		
		//승환쌤 500원 사용
		bank1.withdraw(500);
		bank1.showMoney();
		
		
		bank2.showMoney();
		//수연쌤이 4000원 사용
		bank2.withdraw(4000);
		bank2.showMoney();
		
		
		//승환쌤 5만원을 저금 !!
		//수현쌤 7만원을 저금 !!
		bank1.deposit(50000);
		bank1.showMoney();
		bank2.deposit(70000);
		bank2.showMoney();
		
		

	} 

}
