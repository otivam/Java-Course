import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
/**
		//Напишете програма, която взема дадена цифра (0-9) и я изписва с дума (на англ. език)

Scanner sc = new Scanner(System.in);
	System.out.println("Please enter an integral: ");
	int num = sc.nextInt();

	
	switch(num){
		case 1:System.out.println("One");break; 
		case 2:System.out.println("Two");break; 
		case 3:System.out.println("Three");break; 
		case 4:System.out.println("Four");break; 
		case 5:System.out.println("Fire");break; 
		case 6:System.out.println("Six");break; 
		case 7:System.out.println("Seven");break; 
		case 8:System.out.println("Eight");break; 
		case 9:System.out.println("Nine");break; 
		case 0:System.out.println("Zero");break; 
		
	}

	

		// Напишете програма, която изчислява бонус точки на база резултат от
		// игра. Потребителят трябва да въведе своите точки в интервалa[1;9].
		// Ако точките са в интервала [1;3], умножете ги по 5. Ако точките са в
		// интервала [4;6], умножете ги по 10. Ако точките са в интервала [7;9],
		// умножете ги по 50. Резултатът изведете на екрана.

Scanner sc = new Scanner(System.in);

	System.out.println("Please enter your pointst /1-9/: ");
	int points = sc.nextInt();

	if(points <= 3){
		int res = points * 5;
		 System.out.println("Your result: " + res);
	}else{
		if(points >= 4 && points <= 6){
			int res2 = points * 10;
			System.out.println("Yours result: " + res2);
		}else{
			int res3 = points * 50;
			System.out.println("Yours relst: " + res3);		
		}
	}
*/
		// Класическото тесте карти се състои от 13 различни вида карти
		// съответно 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Направете
		// програма, която приема от конзолата един символ и принтира "Валидна
		// карта", ако символът представлява валидна карта, и съответно принтира
		// "Невалидна карта", ако символът е на невалидна карта.

Scanner sc = new Scanner(System.in);
	
	System.out.println("Pick a card: ");
	char cards = sc.next().charAt(0);

	
	if(cards == '2' || cards == '3' || cards == '4' || cards == '5' || cards == '6' || 
			cards  == '7' || cards == '8' || cards == '9' || cards == 'T' || cards == 'J' ||
			cards == 'Q' || cards == 'K' || cards == 'A'){
			System.out.println("Валидна карта!");
	}else{
			System.out.println("Невалидна карта!");
	}

}
}
