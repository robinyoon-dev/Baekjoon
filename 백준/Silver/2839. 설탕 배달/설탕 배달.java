import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
	
		int weight3 = 3;
		int weight5 = 5;
		
		if(N%5 == 0) {
			System.out.println(N/5);
		}else if(N-3 >=0 && (N-3)%5 == 0) {
			System.out.println(((N-3)/5)+1);
		}else if(N-6 >=0 && (N-6)%5 == 0) {
			System.out.println(((N-6)/5)+2);
		}else if(N-9 >=0 && (N-9)%5 == 0) {
			System.out.println(((N-9)/5)+3);
		}else if(N-12>=0 && (N-12)%5 ==0) {
			System.out.println(((N-12)/5)+4);
		}else if(N%3 == 0) {
			System.out.println(N/3);
		}else {
			System.out.println(-1);
		}
	
		
	}
}