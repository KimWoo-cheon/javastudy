package exCasting;

public class SnackMain {

	public static void main(String[] args) {

		SunChip snack1 = new SunChip();
		Honey snack2 = new Honey();
		YacheTime snack3 = new YacheTime();

		myHand(snack1);
		myHand(snack2);
		myHand(snack3);

	}

//	public static void myHand(SunChip snack) {
//		snack.eat();
//	}
//	public static void myHand(Honey snack) {
//		snack.eat();
//	}
//	public static void myHand(YacheTime snack) {
//		snack.eat();
//	}
	// 클래스들이 많아져서 공통된 내용을 뽑아서 상위 클래스를 만들게 된다면
	// 상위클래스로 하위클래스를 전부 다룰 수 있음.
	public static void myHand(Snack snack) {
		snack.eat();

		// 다운 캐스팅 : 상위 클래스를 하위클래스로 다시 형변환!!
		// 업 캐스팅된 객체만 가능

		// instanceof : 업캐스팅 되기전 클래스 확인하는 방법
		if (snack instanceof YacheTime) {
			//하위클래스명 객체 = (하위클래스명) 업캐스팅된 객체
			YacheTime mySnack = (YacheTime) snack;
			mySnack.ketchup();
		}
	}

}
