package 배열기초;

import java.util.Random;
import java.util.Scanner;

public class Ex01배열기초 {

	public static void main(String[] args) {
		
		Random rd =new Random();
		Scanner sc= new Scanner(System.in);
		
	
		//자료구조란?(Data structure)
		// : 대용량 데이터를 효율적으로 관리하는 방법
		//배열(Array)
		//같은 타입의 여러변수를 하나의 묶음으로 저장하는 자료구조
		//1. 배열 선언 방법
		//자료형[] 배열이름 = new 자료형[데이터개수]; 
		int[] ages = new int[5];
		// 빈배열 -문자 -->null 숫자 -->0
		//ages------>주소값 ------->레퍼런스 변수		
		//stack , heap-garbage collector
		
		//주소값이라는 개념이 왜 나온거지?
		//java라고 하는 어에도 저장공간이 여러개로
		//(폴더를 여러개 구성하듯이)
		//1)Stack 영역 : 비교적 작은 데이터를 저장하는 공간
		//1)Heap 영역 : 비교적작으 데이터를 저장하는 공간
		//왜 사용> GC(Garbage collector)라는 기능이 있다.
		// : 주기적으로 필요없는 데이터를 정리해주는 기능
		
		//new 키워드
		// : 레퍼런스 변수를(주소값) 생성하는 키워드
		
		
		System.out.println(ages);
		//2. 배열안에 있는 데이터에 접근하는 방법
		//**인덱스(index) == 방번호를 알아야 데이터에 접근가능
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);
		//자료형의 기본값이 기본적으로 세팅된다.
		//int, byte, long, short --> 0
		//float, double -->0.0
		//boolean --> false
		//String --> null
		
		ages[0] = 20;
		ages[1] = 21;
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		
		//ages[5] = 4;
		//ArrayIndexOutofBoundException
		//구문에는 문제가 없으나 실행시 문제 발생
		//구문문제 ==syntax error
		//실행시 예상치 못한 문제 == exception
		
		//3. 배열의 특징
		// -같은 타입의 자료만 하나로 묶을 수 있다.
		// -크기가 한번 정해지면 배열의 크기는 바뀔수 없음(고정)
		// -인덱스 번호가 있고, 인덱스 번호는 0부터 시작
		
		//4. 배열을 선언하는데, 초기 데이터를 집어넣으면서 선언하는 방법
		String[] names = {"김운비","이강민","진동준","ㅁ"};
		System.out.println(names[2]);
		
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 선언해주기
		// 2. array의 0번 인덱스에 랜덤한 숫자를 넣어주기
		// *랜덤 숫자의 범위 : 1~10
		
		// 3. array의 1번 인덱스에 랜던숫자 넣어주기
		// *랜던숫자 범위 : 1~10
		//................
	
		
		int[] array =new int[5];
		
		array[0]=rd.nextInt(10)+1;
		array[1]=rd.nextInt(10)+1;
		array[2]=rd.nextInt(10)+1;
		array[3]=rd.nextInt(10)+1;
		array[4]=rd.nextInt(10)+1;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	
		for (int i=0; i<=4; i++) 
		{
		array[i]=rd.nextInt(10)+1;
		}
	
		for (int i=0; i<=4; i++) 
		{
		System.out.println(array[i]);
		}
		
		int[] array2 =new int[5];
		for (int i=0; i<=4; i++) 
		{
			
		array2[i]=sc.nextInt();
		}
		for (int i=0; i<=4; i++) 
		{
		System.out.println(array2[i]);
		}
		
		
		

	}

}
