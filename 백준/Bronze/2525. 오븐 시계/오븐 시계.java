import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(0 <= A && A <= 23 && 0 <= B && B <=59 && 0<= C && C <= 1000) {
			
				double divideCByHour = ((double)C/60);
				int floorCHour = (int)Math.floor(divideCByHour);
				int ceilCHour = (int)Math.ceil(divideCByHour);
				int remainder = (C%60);

				
				if(B + (C%60) >= 60) {
					if(A + ceilCHour >= 24) {

						String Hour = (A + ceilCHour - 24 )+"";
						String Min = (B+(C%60)-60)+"";
						System.out.println(Hour+' '+Min);
						
					} else {	
				
						String Hour = (A +ceilCHour)+"";
						String Min = (B+(C%60)-60)+"";
						System.out.println(Hour+' '+Min);						
					}
				} else if(B + (C%60) < 60) {
					
					if(A + floorCHour >= 24) {
					
						String Hour = (A + floorCHour - 24)+"";
						String Min = (B + (C%60))+"";
						System.out.println(Hour+' '+Min);
						
					} else {
							String Hour = A+floorCHour+"";
							String Min = (B + (C%60))+"";
							System.out.println(Hour+' '+Min);						
							
					}					
					
				}
				
			}
			
		}
	}

