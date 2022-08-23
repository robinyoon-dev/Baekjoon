import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//라운드 수
		for(int i = 0; i < N-1;i++) {
			
			for(int j = 1; j < N-i; j++) {
				
				if(arr[j-1]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}				
			}			
		}
		
		System.out.println(arr[N-k]);
	}	
}