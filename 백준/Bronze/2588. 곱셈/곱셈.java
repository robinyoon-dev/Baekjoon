import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		String bString = Integer.toString(B);
		
		String[] bArray = bString.split("");
		
		int num3 = A*(Integer.parseInt(bArray[0]));
		int num4 = A*(Integer.parseInt(bArray[1]));
		int num5 = A*(Integer.parseInt(bArray[2]));
		
		System.out.println(num5);
		System.out.println(num4);
		System.out.println(num3);
		System.out.println(A*B);

			
	}
	
}