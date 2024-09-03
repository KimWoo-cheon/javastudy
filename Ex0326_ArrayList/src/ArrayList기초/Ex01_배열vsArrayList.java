package ArrayList기초;

import java.util.ArrayList;

public class Ex01_배열vsArrayList {

	public static void main(String[] args) {
		// 1. 선언
		// 배열
		// 자료형[] 변수명 = new 자료형[크기];
		int[] intArray = new int[5];
		int a = 0;

		// Arraylist(가변리스트)
		// import 필요!!
		// 데이터타입은 객체타입으로 작성, int -> Integer
		// ArrayList<타입> 변수명 = new ArrayList<타입>();
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();

		// 크기 확인
		System.out.println("배열의 크기 : " + intArray.length);
		System.out.println("ArrayList의 크기 : " + intArrayList.size());
		// 2. 값 추가
		// 배열
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;
		intArray[3] = 3;
		intArray[4] = 4;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}

		// ArrayList -> add(추가할 값) 메소드 사용
		// 변수명.add(추가할 값); add메소드 사용 ->순차적으로 값이 저장
//		intArrayList.add(0);

		for (int i = 0; i < 5; i++) {
			intArrayList.add(i);
		}
		System.out.println("값 추가한 후 ArrayList크기 : " + intArrayList.size());

		// 원하는 자리에 값 추가
		// intArrayList.add(index,value)
		intArrayList.add(3, 5);

		// 3. 값 조회
		// 배열 -> 변수명[index]
		System.out.println("1번째 자리의 배열 값 : " + intArray[1]);

		// ArrayList -> ArrayList변수명.get(index)
		System.out.println("1번째 자리의 ArrayList의 값 : " + intArrayList.get(1));

		// 반복문 통해서 전체 값 출력
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + "번째 자리의 ArrayList의 값 :  " + intArrayList.get(i));
			// 오버로딩..;
		}
		// 4. 삭제
		// 변수명.remove(index) : 해당 인덱스를 삭제
		// 변수명.clear(): 모든 값을 삭제

		intArrayList.remove(3);
		System.out.println("===================================");
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + "번째 자리의 ArrayList의 값 :  " + intArrayList.get(i));
		}
		intArrayList.clear();
		System.out.println("===================================");
		System.out.println(intArrayList.size());
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + "번째 자리의 ArrayList의 값 :  " + intArrayList.get(i));
			

		}
	}

}
