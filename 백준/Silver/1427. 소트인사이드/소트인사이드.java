import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String tempN = Integer.toString(N);
		
		int tempNLength = tempN.length();
					
		Integer[] iArray = new Integer[tempNLength]; //왜 int가 아니라 Integer를 써야하지?
		
		for(int i = 0; i < tempNLength ; i++) {
			iArray[i] = tempN.charAt(i)-'0';
		}
		
		Arrays.sort(iArray, Collections.reverseOrder());	
		
		int[] printArray = new int[tempNLength];
		
		for(int i = 0; i < tempNLength ; i++) {
			printArray[i] = iArray[i];
		}
		
		for(int i = 0; i < tempNLength ; i++) {
			System.out.print(printArray[i]);
		}		
	}
}