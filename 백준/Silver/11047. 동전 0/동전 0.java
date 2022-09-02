import java.util.Scanner;

public class Main{
			
	static int forMaxCount = 0;
	static int ordinalNum = 0;
	
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //동전 종류 수
		int K = sc.nextInt(); //목표 합

		int[] coinArr = new int[N];
		forMaxCount = N;	
		
		for(int i = 0; i < N; i++) {
			coinArr[i] = sc.nextInt();
		}
		
		int max = 0;
		int sum = 0;
		int cnt = 0;//필요한 동전 개수
		
			
		max = findMax(coinArr, max, K, sum);
			
		while(sum <= K){ 			
			sum += max; 
			cnt++;			
			if(max > K-sum) {
				max = findMax(coinArr, max, K, sum);
			}
			if(sum == K){
				System.out.println(cnt);	
				break;
			}
		}			
				
	}

	
	public static int findMax(int[] coinArr, int max, int K, int sum){
		
		int middleMax =0;
		
		for(int i = 0; i < forMaxCount; i++) {
			if(coinArr[i]<= K-sum && coinArr[i] > middleMax) {
				middleMax = coinArr[i];
				ordinalNum = i;
			}
		}
		
		max = middleMax;
		
		forMaxCount = ordinalNum;
		return max;
	}
	
}