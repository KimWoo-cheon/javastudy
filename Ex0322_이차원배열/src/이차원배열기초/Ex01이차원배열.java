package 이차원배열기초;

public class Ex01이차원배열 {

	public static void main(String[] args) {
		
		//1. 이차원 배열 선언하기
		// 정수형 데이터를 저장할 수 있는 이차원 배열 선언하기 3행3열짜리 이차원배열 선언하기
		int [][] array = new int[3][3];
		
		System.out.println(array);
		System.out.println(array[0]);
		//System.out.println(array[0][0]);
		
//		array[0][0]=1;
//		array[0][1]=2;
//		array[0][2]=3;
//		array[1][0]=4;
//		array[1][1]=5;
//		array[1][2]=6;
//		array[2][0]=7;
//		array[2][1]=8;
//		array[2][2]=9;
		int k=1;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				array[i][j]=k;
				k++;
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(array[i][j]);
			}
		}
		
	}

}
