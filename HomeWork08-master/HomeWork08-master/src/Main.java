import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
/**
		// �������� ��������, ����� ������� ������������� �������� ��������
		// ����� �� ����� � ������� �� ������ ���� �������.

		int a[][] = new int[][] {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] % 2 == 0){
					System.out.println(a[i][j]);
				}
				
			}
			
			
		}
	
		// �������� ��������, ����� ��������� �� ����������� �� ������� ����� �
		// ������� 3�4. �������� ������ �� ������.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input array size: ");
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][] matrix = new int[rows][cols];
		
		for(int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				System.out.printf("matrix [%d,%d] = ", i, j);
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
		
		
		// �������� ��������, ����� ������ �� ��������� 2 ����� a � b (b > a) �
		// ������� �� ������ ������ ����� �� a �� b, ����� �� ����� �� 3 ���
		// �������
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();

		for (int i = a; i < b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}
		
		
		// �������� ��������, ����� �������� �� ������ ������� �� 30 �� 1 �
		// ������� ���, ��������� � 5 ���� � 6 ������

		int a[][] = new int[5][6];
		for(int i = 0, e = 30; i < 5;i++){
			for(int j = 0; j < 6; j++, e--){
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		// �������� ��������, ����� ����� �������� ����� � ������ NxN, � ����
		// ���� �������� ������ �� ������� ��������. * 
		// ������� ��� 2 �������� ��������. ��� ������, ������ �� ������� �� �����������,
		// � ��� ������, ����������� �������� �� �� ������� �������, ���� ������� ������ 
		// �� �� �� ������� ��������.
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size: ");
		int a = sc.nextInt();
		
		int matrix[][] = new int[a][a];
		
		for(int i = 0; i < a; i++){
			for (int e = 0; e < a; e++){
				System.out.printf("matrix [%d,%d] = ", i, e);
				matrix[i][e] = sc.nextInt();
			}
		}
		int sum = 0;
				for (int w = 0; w < a; w++){
					sum = sum + matrix[w][w];
				}
		System.out.println(sum);
		*/
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size: ");
		int a = sc.nextInt();
		
		int matrix[][] = new int[a][a];
		
		for(int i = 0; i < a; i++){
			for (int e = 0; e < a; e++){
				matrix[e][i] = (int)(1 + Math.random() * 10.0);
			}
			
		}
		int sum = 0;
				for (int w = 0; w < a; w++){
					sum = sum + matrix[w][w];
				}
		System.out.println(Arrays.deepToString(matrix));		
		System.out.println(sum);
		
		
	}

}
