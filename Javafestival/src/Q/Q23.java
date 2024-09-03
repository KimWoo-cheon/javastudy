package Q;


import java.util.Random;
public class Q23 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int array[] = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i]=rd.nextInt(45)+1;
		}
		for (int i=0; i<array.length; i++ )
		{
			for (int j=0; j<i; j++ )
				{
				if(array[i] == array[j])
				{ array[i]=rd.nextInt(45)+1;
				j=-1;
				}
				}
		}
			for (int j = 0; j < array.length; j++) {
				System.out.print("행운의 숫자 : ");
				System.out.println(array[j]);
			}
	}

}
