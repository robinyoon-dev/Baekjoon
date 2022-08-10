import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
	
		if(0 <= H && H <= 23 && 0 <= M && H <=59) {
		
			if(M - 45 >= 0) {
				String Hour = H+"";
				String Min = (M-45)+"";				
				System.out.println(Hour+' '+Min);
			}else if(M - 45 < 0) {
				if(H - 1 >= 0) {
					String Hour = (H-1)+"";
					String Min = (60 - (45 - M)) + "";
					
					System.out.println(Hour+' '+Min);
				}else if(H - 1 < 0) {
					String Hour = "23";
					String Min = (60 - (45 - M)) + "";
					
					System.out.println(Hour+' '+Min);
				}
				
			}
			
		}
	}
}