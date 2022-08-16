import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();	
		int B = scanner.nextInt();			
		int C = scanner.nextInt();	
		
	
		int i = 0;
		int totalCost = 0; //총비용
		int totalIncome = 0;
		if(B<C) {	
			System.out.println((A/(C-B))+1);
		} else {
			System.out.println(-1);
		}
		
	}
	
}