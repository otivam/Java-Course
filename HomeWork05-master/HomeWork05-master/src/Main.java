
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
/**	
		// �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N.
		// ������� N �� ������� �� ���������.
	
Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your number: ");
	int n = sc.nextInt();
	int a = 1;
	
	while(a < n){
		System.out.println(a);
		a ++;
	}

		// �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N,
		// ����� �� �� ����� �� 3 � 7. ������� N �� ������� �� ���������.
	
Scanner sc = new Scanner(System.in);
	System.out.println("Input your number: ");
	int number = sc.nextInt();
	int a = 1;
	
	while(a < number){
		if(a % 3 != 0 && a % 7 != 0){
			System.out.println(a);
		}
		
		a ++;
	}

	
		// �������� ��������, ����� ���� �� ��������� �������� �� ���� �����
		// (�������� 5 �����) � ��������� ���-������� � ���-�������� �� ���.

	Scanner input = new Scanner (System.in);
	int minValue = 0;
	int maxValue = 0;
	
	
	System.out.print("numbers: ");
	int number = input.nextInt();
	for (int i = 0; i < number;i++) {
		System.out.println("next number: ");
		int a = input.nextInt();
		
		if(i == 0){
			minValue = a;
			maxValue = a;		
		}else{
			if(minValue > a){
				minValue = a;
			}
			if(maxValue < a){
				maxValue = a;
			}
		}
	}
	
	
	
	System.out.println("minValue is: " + minValue);
	System.out.println("maxValue is: " + maxValue);
	}
	
	}


	*/
	//�������� ��������, ����� �������� N!/K! �� ������ N � K (1<K<N). 
	
Scanner sc = new Scanner(System.in);
	System.out.println("enter N: ");
	int n = sc.nextInt();
	System.out.println("enter K: ");
	int k = sc.nextInt();
	
	long facn = 1;
	long fack = 1;
	
	while (true){
		if (n == 1){
			break;
		}
		facn *= n;
		n--;
	}
	
	while (true){
		if (k == 1){
			break;
		}
		fack *= k;
		k--;
	}
	
	System.out.println("Result: "+ facn / fack);
}
}
/**

	//�������� ��������, ����� �������� N!*K!/(N-K)! �� ������ N � K. *

	Scanner in = new Scanner (System.in);
	int N = in.nextInt();
	int K = in.nextInt();
	
	int fN = 1;
	for(int i = 1; i <= N; i++){
		fN = fN * i;
	}
	
	int fK = 1;
	for (int i = 1; i <= K; i++){
		fK = fK * i;
	}
	
	int fNsubK = 1;
	for (int i = 1; i<= (N - K); i++){
		fNsubK = fNsubK * i;
	}
	System.out.println((double) fN * fK / (double) fNsubK);
	
}	
}
	*/