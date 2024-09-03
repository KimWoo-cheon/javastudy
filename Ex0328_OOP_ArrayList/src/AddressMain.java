import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> dataSet = new ArrayList<Address>();

		for (int i = 0; i < i+1; i++) {
			System.out.println();
			System.out.println("=======================================");
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int select = sc.nextInt();
			System.out.println("=======================================");
			System.out.println();
			if (select == 1) {
				System.out.print("이름 : ");
				String inputName = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String number = sc.next();

				Address newMember = new Address(inputName, age, number);
				dataSet.add(newMember);

			} else if (select == 2) {

				if (dataSet.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}

				for (int j = 0; j < dataSet.size(); j++) {
					System.out.print(j + 1 + ".");
					dataSet.get(j).showAll();
				}

			} else if (select == 3) {
				System.out.print("1.선택삭제  2.전체삭제 >> ");
				int select3 = sc.nextInt();

				if (select3 == 2) {
					dataSet.clear();
				} else if (select3 == 1) {
					if (dataSet.size() == 0) {
						System.out.println("등록된 연락처가 없습니다.");
					} else {
						System.out.print("삭제할 이름 입력 >> ");

						String select3d = sc.next();
//						dataSet.remove()
						for (i = 0; i < dataSet.size(); i++) {
							if (dataSet.get(i).getName().equals(select3d)) {
								dataSet.remove(i);
							}
						}
						;
					}
				}
			} else if (select == 4) {
				if (dataSet.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {

					System.out.println("조회할 이름 입력 >> ");

					String select4 = sc.next();
					for (i = 0; i < dataSet.size(); i++) {
						if (dataSet.get(i).getName().equals(select4)) {
							dataSet.get(i).showAll();
						}
					}
				}
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 선택하세요");
			}

		}
	}

}
