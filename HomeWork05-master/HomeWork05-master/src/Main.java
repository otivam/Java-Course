
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
/**	
		// Напишете програма, която отпечатва на конзолата числата от 1 до N.
		// Числото N се въвежда от конзолата.
	
Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your number: ");
	int n = sc.nextInt();
	int a = 1;
	
	while(a < n){
		System.out.println(a);
		a ++;
	}

		// Напишете програма, която отпечатва на конзолата числата от 1 до N,
		// които не се делят на 3 и 7. Числото N се въвежда от конзолата.
	
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

	
		// Напишете програма, която чете от конзолата поредица от цели числа
		// (примерно 5 числа) и отпечатва най-малкото и най-голямото от тях.

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
	//Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N). 
	
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

	//Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K. *

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