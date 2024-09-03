package Q;

import java.util.Arrays;

import java.util.Scanner;
public class Q30 {

	public static void main(String[] args) {
	 
		System.out.print("첫자리 0을 제외한 숫자를 입력해 주세요 >> ");
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int n=0;
		int j=1;
		int sum=0;
		int m=num;
		int i;
		for( i=1; i<=j; i++) {
		if(m/10 !=0) {
			m=m/10;
			j=j*10;
			n++;
			
			
		}
		}
		//System.out.println(n);
		int[] array = new int[n+1];
		
		for (i=n; i>=0; i--)
		{array[i]=num%10;
			num=num/10;
		
		}
		//System.out.println(Arrays.toString(array));
		for (int k = 0; k <= n; k++) {
			if ( array[k]==0) {
				sum=sum+6;
			}
			else if ( array[k]==1)
			{
				sum=sum+2;
			}
			else if ( array[k]==2)
			{
				sum=sum+5;
			}
			else if ( array[k]==3)
			{
				sum=sum+5;
			}
			else if ( array[k]==4)
			{
				sum=sum+4;
			}
			else if ( array[k]==5)
			{
				sum=sum+5;
			}
			else if ( array[k]==6)
			{
				sum=sum+6;
			}
			else if ( array[k]==7)
			{
				sum=sum+3;
			}
			else if ( array[k]==8)
			{
				sum=sum+7;
			}
			else if ( array[k]==9)
			{
				sum=sum+6;
			}
			
		}
		System.out.print("대시('-')의 총 합 >> ");
		System.out.println(sum);
			
		}
		
		
		
		}
		

		
		
		


