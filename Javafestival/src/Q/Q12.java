package Q;

import java.util.Random;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random rd = new Random();
		int[] array =new int[8];
		int max=0;
		int min=0;
		for (int i=0; i<=7; i++) 
		{
		array[i]=rd.nextInt(99)+1;
		}
		max=array[0];
		min=array[1];
		for(int i=0; i<=7; i++)
		{
			for (int j=0; j<=7; j++)
			if (max-array[j]<0)
			{
				max=array[j];
			}
			else if (min-array[j]>0)
				min=array[j];
			
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int j = 0; j < array.length; j++) {
			
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		System.out.println("최대"+max);
		System.out.println("최소"+min);
		
	}

}
