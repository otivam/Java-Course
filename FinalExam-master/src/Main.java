
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
		// Потребителят трябва да може да въведе число от 2 до 9, което число
		// представлява едната страна на квадратен двумерен масив (матрица).
		// Програмата трябва да може да пресметне колко е броят на необходимите
		// елементи, с който може да се попълни квадратният двумерен масив и да
		// създаде едномерен масив с тази дължина. Потребителят трябва да може
		// да въведе толкова стойности, че да попълни едномерния масив. След
		// като едномерният масив е попълнен, той трябва да бъде обходен, за да
		// се изчисли общата сума от всичките въведени стойности. Сумата да се
		// изпише на екрана. В двумерния масив трябва да се попълнят стойностите
		// от едномерния. Попълването на двумерния масив трябва да стане
		// вертикално (колона по колона).
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Въведете число: ");
		int input = scan.nextInt();
	
		if(input < 2 || input > 9){
			System.out.println("Въведете число от 2 до 9: ");
			input = scan.nextInt();
		}
		
		
		int array[][] = new int[input][input];
		int arraysize = 0;

		for (int i = 0; i <= input; i++) {
			for (int j = 0; j <= input; j++) {
				arraysize = i * j;
			}
		}
		System.out.println("Необходимите елементи и дължината на едномерния масив са: "+"\n" + arraysize);
		int smallarray[] = new int[arraysize];
		
		System.out.println("Попълнете едномерния масив: ");

		for (int i = 0; i < arraysize; i++) {
			smallarray[i] = scan.nextInt();
		}
		System.out.println("Извеждане на едномерния масив: "+"\n" + Arrays.toString(smallarray));
		int b = 0;
		for(int i = 0; i < smallarray.length; i++){
				b = b + smallarray[i];
			}
		System.out.println("Сумата е: " + b);
		
		for(int i = 0; i < input; i++){		
			   for(int j = 0; j < input; j++){
			       array[i][j] = smallarray[(j * input) + i]; 
			   }
		}
		System.out.println("Извеждане на двумерния масив: "+"\n" + Arrays.deepToString(array).replace("], ", "]\n"));
		
	}

}