import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// napishete programa, koqto namira sbora ot vsichkite chetni elementi v
		// masiva

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) { 
			System.out.println("numbers[" + i + "] = " + a[i]); 
		} 
		int sum = 0; 
		for (int i = 0; i < a.length; i++){ 
			if (i % 2 == 0) { 
				sum = sum + a[i];

			}

		}

		System.out.println("Sum is: " + sum);

		// napishete programa, koqto popylva chislata na Fibonachi w masiw.
		// Potrebitel wywejda kolko da e golqm masiva. 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: "); 
		int a = sc.nextInt(); 
		int array[] = new int[a]; 
		array[0] = 1; 
		array[1] = 1;

		for (int i = 2; i < array.length; i++) { 
			array[i] = array[i - 1] + array[i - 2];

		} 
		System.out.println(Arrays.toString(array));


		// napishete programa, koqto syzdava masiw s 10 elementa ot
		//celochislen tip i inicializira elementite sys stojnost indeksa
		//umnojen po 10

		int a[] = new int[10];

		for(int i = 0;i < a.length;i++){ 
			a[i] = i * 10; 
		}
		System.out.println(Arrays.toString(a));


		// napishete programa, koqto tyrsi chislo w masiw ot chisla i wryshta
		// indeksa na pyrwoto namereno chislo

		Scanner sc = new Scanner(System.in);

		int a[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,18,20};



		System.out.println("Input your number: ");

		int c = sc.nextInt();
		int b = 0;
		while(a[b] != c){
			b++;	
		}
		System.out.println(b);


	}

}
