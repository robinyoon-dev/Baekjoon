import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int[] num = new int[9];
		int max = num[0];
		int j = 0;	
		int count = 0;
		
		
		for(int i = 0; i < 9; i++) {
			int input = scanner.nextInt();
			if(input > 100) {
				input = scanner.nextInt();		
			}		
			num[i] = input;	
		}
				
		for(j = 0 ; j < 9; j++) {
			if(max < num[j]) {
				max = num[j];
				count = j+1;
			}
		}
		
		System.out.println(max);
		System.out.println(count);	
				
		}
	}