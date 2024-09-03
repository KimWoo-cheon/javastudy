package 배열기초;
import java.util.Random;
public class aa {

	public static void main(String[] args) {
		
				Random random = new Random();
				int[] lotto = new int[6];
				
				for(int i = 0; i < 6; i++) {
					int number = random.nextInt(6)+1;
					for(int j = 0; j < i; j++) {
						if(lotto[j] == number) {
							number = random.nextInt(6) + 1;
							j = -1;
						}
					}
					lotto[i] = number;
				}
				
				
				for(int i =0;i<=5;i++)
				{
					System.out.print("행운의 숫자 : "+lotto[i]);
					System.out.println("");
				}

				
				
			}




}
