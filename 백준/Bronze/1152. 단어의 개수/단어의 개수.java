import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String A = scanner.nextLine();
		
		A = A.strip();
		
		String[] arrayA = A.split(" "); 		
		
		int count = 0;
		
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i]=="") {
				count++;
			}
		}
		
		
		System.out.println(arrayA.length - count++);

			
	}
	
}