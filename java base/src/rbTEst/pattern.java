package rbTEst;

public class pattern {

	public static void main(String[] args) {
		char num='A';
		for (int i = 0; i <num; i++) {
			
			for (int j =num-i; j >1; j--) {
				
				System.out.print(" ");
				
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
