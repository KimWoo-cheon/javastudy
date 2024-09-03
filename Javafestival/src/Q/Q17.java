package Q;

public class Q17 {

	public static void main(String[] args) {
		String score="A,A,B,C,D,A,C,D,D,D,F";
		int nA= score.length()-(score.replace("A","")).length();
		System.out.println("A : "+nA+"명");
		
		int nB= score.length()-(score.replace("B","")).length();
		System.out.println("B : "+nB+"명");
	
		int nC= score.length()-(score.replace("C","")).length();
		System.out.println("C : "+nC+"명");
	
		int nD= score.length()-(score.replace("D","")).length();
		System.out.println("D : "+nD+"명");
		
		int nF= score.length()-(score.replace("F","")).length();
		System.out.println("F : "+nF+"명");
	}

}
