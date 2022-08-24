import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strNum1 = sc.next();
		String strNum2 = sc.next();
		
		//reverse
		StringBuffer sb1 = new StringBuffer(strNum1);
		String reverseNum1 = sb1.reverse().toString();
		
		StringBuffer sb2 = new StringBuffer(strNum2);
		String reverseNum2 = sb2.reverse().toString();
		
		int realNum1 = Integer.parseInt(reverseNum1);
		int realNum2 = Integer.parseInt(reverseNum2);
		
		if(realNum1 > realNum2) {
			System.out.println(realNum1);
		} else {
			System.out.println(realNum2);
		}
						
	}
	
}