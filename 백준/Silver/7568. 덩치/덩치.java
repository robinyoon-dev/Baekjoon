import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 전체 사람 수
		
		int[][] arr = new int[3][N];
		
		
		for(int i = 0; i < N; i++) {
			int x = scanner.nextInt(); //몸무게
			int y = scanner.nextInt(); //키
			int k = 0; //앞에 있는 사람 수
			
			arr[0][i] = x; 
			arr[1][i] = y;
			arr[2][i] = k+1; //등 수
		}
		

		for(int i = 0; i < N; i++) {
			
			for(int j = i+1; j < N; j++) {
				
				if(arr[0][i] > arr[0][j] && arr[1][i] > arr[1][j]) {
					arr[2][j] += 1;
				} 
				
				if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]) {
					arr[2][i] += 1;
				}

			}
									
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[2][i]+ " ");			
		}
	
						
	}	
	
}