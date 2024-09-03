package 배열기초;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05배열예제 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int[] array=new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(i+1+"번째 입력 >>");
			array[i]=sc.nextInt();
		}
		System.out.println("입력된 점수 : "+Arrays.toString(array));
	 int M=array[0];
	 int m=array[1];
	 int sum=0;
	 double avg=0;
	 for (int i = 0; i < array.length; i++) {
		if(array[i]>M) {
			M=array[i];
		}
		else if (array[i]<m) {
			m=array[i];
		}
	}
		for (int j = 0; j <array.length; j++) {
			sum=sum+array[j];
			
		}	
	avg=(avg+sum)/array.length;
	

	 System.out.println("최고 점수 : "+M);
	 System.out.println("최저 점수 : "+m);
	 System.out.println("총합 점수 : "+sum);
	 System.out.println("평균 점수 : "+avg);
	}

}
