import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		
		
		for(int i = M ; i <= N; i++) {
			int testCount = isPrime(i);
			if( testCount != 0 ) {
				System.out.println(testCount);				
			}
		}

						
	}
	
	
	public static int isPrime(int n) {
		
		if(n == 1) {return 0;}
		
		for (int i = 2; i<=(int)Math.sqrt(n); i++) {
	      if (n % i == 0) {return 0;}
		}
		return n;
	}		
	
}