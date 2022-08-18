import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 카드 수
		int M = scanner.nextInt(); // 목표 합
		
		int[] cardList = new int[N];
		
		for(int i = 0; i < N; i++) {
			cardList[i] = scanner.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		
		for(int j = 0; j < N; j++) {
			for(int k = j+1; k < N; k++) {
				for(int l = k+1; l < N; l++) {
				
					sum = cardList[j] + cardList[k] + cardList[l];
					
					if(sum == M) {
						max = sum;
						break;
						
					} else if(sum < M ) {
						if(max < sum) {
							max = sum;
						}
					}
				}
			}
		}
		
		System.out.println(max);
		
				

		
						
	}	
	
}