import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numArray = new int[N];
		
		for(int i = 0; i < N; i++) {
			numArray[i] = sc.nextInt();
		}
		
		bubble_sort(numArray, numArray.length);
		
		for(int i = 0; i < numArray.length; i++){
			System.out.println(numArray[i]);			
		}

	}
	
	public static void bubble_sort(int[] a, int size) {
		
		
		//round는 배열 크기 -1 만큼 진행됨. 
		for(int i =1; i < size; i++) {
			
			//각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {				
				if(a[j]>a[j+1]) {
					swap(a, j, j+1);
				}			
			}					
		}	
		
	}
	
	public static void swap(int[] a, int firstNumber, int secondNumber) {
		int temp = a[firstNumber];
		a[firstNumber] = a[secondNumber];
		a[secondNumber] = temp;
	}
	
}