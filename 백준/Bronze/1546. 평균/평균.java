import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt(); //과목 개수
		double[] scoreArray = new double[N];
		double M = 0; //최댓값		
		double sum = 0; //점수 총합
		double avg = 0;
		
		for(int i = 0; i<N; i++) {
			scoreArray[i] = sc.nextInt();
		}
			
		for(int i = 0; i<N; i++) {
			if(M <= scoreArray[i]) {
				M = scoreArray[i];
			}
		}	
		
		for(int i = 0; i<N; i++) {
			sum += scoreArray[i]/M*100;
		}
				
		avg = sum/N;
		
		System.out.println(avg);
					
	}
}