import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numberList = new int[N];
		
		for(int i = 0; i < N ; i++) {
			numberList[i] = sc.nextInt();
		}
		
		int max = numberList[0];
		int min = numberList[0];
		
		for(int i = 0; i < N; i++) {
			
			if(max < numberList[i]) {
				max = numberList[i];
			}
			
			if(min > numberList[i]) {
				min = numberList[i];
			}
			
		}
		
		System.out.println(min+" "+max);
		
	}
	
}