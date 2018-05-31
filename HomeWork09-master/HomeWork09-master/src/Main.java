import java.util.Scanner;

public class Main {

	// Напишете метод, който при подадено име отпечатва в конзолата "Greetings,
	// <name>!"
	// (Напишете програма, която тества този метод.)

	public static void name12(String name) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Greetings, " + a + "!");
	}
	
	// Дефинирайте метод, който приема 3 параметъра - цели числа и ги умножава
	// едно с друго. Извикайте функцията 10 пъти с различни произволни числа.
	
	public static int zadacha2(int a, int b, int c){
		return a * b * c;
		
	}
	
	// Дефинирайте метод, който приема един параметър – число, и принтира на
	// екрана "четно", ако числото е четно, и "нечетно ", ако числото е нечетно.
	// Демонстрирайте действието на фукцията с няколко примера
	
	public static void zadacha3(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for exam 3: ");
		int chislo = sc.nextInt();
		if(chislo %2 == 0){
			System.out.println("Четно!");
		} else{
			System.out.println("Нечетно!");
		}
	}
	
	// Създайте метод MaxNumber() с два целочислени (int) параметъра, който
	// връща по-голямото от двете числа. Напишете програма, която прочита три
	// цели числа от конзолата и отпечатва най-голямото от тях, използвайки
	// метода MaxNumber().
	
	public static int MaxNumber(int a, int b){
		 
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter your name: ");

		name12("");   // 1
		
		for(int i = 0; i < 10; i++){  // 2
			System.out.println(zadacha2((int) (Math.random()*10),
					(int) (Math.random() * 15),
					(int) (Math.random() * 20)));
		}
		System.out.println("Повторения: ");   // 3
		Scanner scan = new Scanner(System.in);
		int num3 = scan.nextInt();
		for(int i = 0; i < num3; i++){
			zadacha3();
		}
		System.out.println("Enter 3 numbers for MaxNumber: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = scan.nextInt();
		int w = MaxNumber (a,b);
		System.out.println("MaxNumber is: " + MaxNumber(d,w));
		
		
	}

}
