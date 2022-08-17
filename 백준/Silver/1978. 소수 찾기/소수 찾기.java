import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		
		int[] numberList = new int[testCase];
		
		for(int i = 0; i< testCase ; i++) {			
			numberList[i] = scanner.nextInt();			
		}
		
		int count = 0;
		
		for(int j = 0; j < numberList.length; j++) {
			
			int trueOrFalse= isPrime(numberList[j]);
			
			if(trueOrFalse == 1) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
	
	public static int isPrime(int n) {
		
		if(n == 1) {
			return 0;
		}
		
		for (int i = 2; i<=(int)Math.sqrt(n); i++) {
	      if (n % i == 0) {
	          return 0;
	      }
		}
		return 1;
	}		
	
}