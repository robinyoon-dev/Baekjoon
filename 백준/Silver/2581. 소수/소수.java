import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		int totalPrimeCnt = 0;
		
		int totalPrimeSum = 0;
		
		for(int i = M ; i <= N; i++) {
			int testCount = isPrime(i);
			if( testCount != 0 ) {
				totalPrimeCnt++;
				totalPrimeSum += isPrime(i);
			}
		}
		
		int firstPrime = 0;
		
		for(int j = M ; j <= N; j++) {
			int testCount = isPrime(j);
			if( testCount != 0 ) {
				firstPrime = isPrime(j);
				break;
			}
		}		
		
		
		if(totalPrimeCnt == 0) {
			System.out.println(-1);
		}else {
			System.out.println(totalPrimeSum);
			System.out.println(firstPrime);			
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