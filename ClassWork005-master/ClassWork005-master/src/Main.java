import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);	
	int num = 1;
	int a = scan.nextInt();
	
	while(num < a){
		if (num %2 != 0){
		System.out.println(num);
		}
		num ++;
		
	}
	
	
	


}
}