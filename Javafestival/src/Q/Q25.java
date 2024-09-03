package Q;

import java.util.Arrays;

public class Q25 {

	public static void main(String[] args) {
		int[] point = new int[7];

				point[0]=92;
				point[1]=32;
				point[2]=52;
				point[3]=9;
				point[4]=81;
				point[5]=2;
				point[6]=68;
				int d=point[0]-point[1];
				int [] result = new int[2]; 
				result[0]=point[0];
				result[1]=point[1];
		for(int i=0; i<7; i++) {
			for (int j=i; j<7; j++) {
				
				if(point[i]-point[j]<0) {
					if(d>point[j]-point[i]){
						d=point[j]-point[i];
						result[0]=i;
						result[1]=j;
					}
				}
				else if(point[i]-point[j]>0) {
						if(d>(point[i]-point[j])){
							d=(point[i]-point[j]);
							result[0]=i;
							result[1]=j;
						}
				}
				
					
			}
		}
				


		System.out.println("result = "+Arrays.toString(result));

}
}

