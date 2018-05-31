import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// zadacha 2
		/**
		  int[] array = new int[] { 1, 2, 3, 4, 5 };
		  
		  
		  int length = array.length;
		  
		  
		  int[] reversed = new int[length];
		  
		  
		  for (int index = 0; index < length; index++) { reversed[length -
		  index - 1] = array[index]; }
		  
		  
		  System.out.println(Arrays.toString(reversed));
		  // zadacha 1
		  int[] arrayOne = {0,1,2,3,4};		
			int lenArrOne = arrayOne.length;
			
			int[] arrayTwo = new int[lenArrOne];
			
			for (int i = 0; i < arrayOne.length; i++) {
				arrayTwo[i] = arrayOne[i];
			}
			
			System.out.println("ArrayOne is: " + Arrays.toString(arrayOne));
			System.out.println();
			System.out.println("ArrayTwo is: " + Arrays.toString(arrayTwo));	
			
		// zadacha 3 
			Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
		  array[i] = input.nextInt();
		}
		boolean symmetric = true;
		for (int i = 0; i < (array.length + 1) / 2; i++) {
		  if (array[i] != array[n - i - 1])
		  symmetric = false;
		}
		System.out.printf("Symmetric? %b%n", symmetric);
	*/
		
		int n = 100;
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = n - 15;
				//System.out.println(matrix[i][j]);
				
				 System.out.print(matrix[i][j] + " ");
				n--;
			}
			System.out.println();
		
		
		}
	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] %2 !=0){
					matrix[i][j] = matrix[i][j] *2;
				}
				System.out.print(matrix[i][j] + " ");
			
				
			}
			System.out.println();
		}
	
	
	}
}