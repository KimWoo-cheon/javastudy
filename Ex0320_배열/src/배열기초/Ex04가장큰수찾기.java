package 배열기초;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] array =new int[5];
		int M=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=rd.nextInt(10)+1;
		}
		M=array[0];
		 for(int j=0; j< array.length; j++)
		    { 
			 if (array[j]-M>0)
		 	{
			 M=array[j];
		 	}
			 
		 }
		
		
		System.out.print("배열 안에 들어 있는 값 : ["+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]);
			

				System.out.println("]");
				System.out.println("가장 큰 값은 "+M+" 입니다");
				
				System.out.println(Arrays.toString(array));

	}

}
