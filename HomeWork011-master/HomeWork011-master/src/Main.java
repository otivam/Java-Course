import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
/**
		//�������� ��������, ����� ����� ������ ����� (0-9) � � ������� � ���� (�� ����. ����)

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

	

		// �������� ��������, ����� ��������� ����� ����� �� ���� �������� ��
		// ����. ������������ ������ �� ������ ������ ����� � ��������a[1;9].
		// ��� ������� �� � ��������� [1;3], �������� �� �� 5. ��� ������� �� �
		// ��������� [4;6], �������� �� �� 10. ��� ������� �� � ��������� [7;9],
		// �������� �� �� 50. ���������� �������� �� ������.

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
		// ������������ ����� ����� �� ������ �� 13 �������� ���� �����
		// ��������� 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. ���������
		// ��������, ����� ������ �� ��������� ���� ������ � �������� "�������
		// �����", ��� �������� ������������ ������� �����, � ��������� ��������
		// "��������� �����", ��� �������� � �� ��������� �����.

Scanner sc = new Scanner(System.in);
	
	System.out.println("Pick a card: ");
	char cards = sc.next().charAt(0);

	
	if(cards == '2' || cards == '3' || cards == '4' || cards == '5' || cards == '6' || 
			cards  == '7' || cards == '8' || cards == '9' || cards == 'T' || cards == 'J' ||
			cards == 'Q' || cards == 'K' || cards == 'A'){
			System.out.println("������� �����!");
	}else{
			System.out.println("��������� �����!");
	}

}
}
