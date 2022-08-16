import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		int T = scanner.nextInt(); //testCase
		int[][] arr = new int[3][T];
		
		for(int i = 0; i < T; i++) {
		
			int H = scanner.nextInt(); //층 수
			int W = scanner.nextInt(); //각 층의 방 수 
			int N = scanner.nextInt(); //몇 번째 손님
			
			arr[0][i] = H;
			arr[1][i] = W;
			arr[2][i] = N;
		}
		
		for(int i = 0; i < T; i++) {
			
			
			
			int realH = arr[2][i]%arr[0][i];
			
			if(realH == 0) {
				realH = arr[0][i];
			}
			
			int realW = ((arr[2][i]-realH)/arr[0][i])+1;
			
			if(realW < 10) {
				System.out.println(realH +"0"+ realW);				
			} else {
				System.out.println(realH+""+realW);
			}			
			
		}
		
		
		
	}
		
	
}