import java.util.Scanner;
public class zadachatri {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum = 0;

while(a != 0){
	
	sum += a;
	System.out.println(sum);
	a = sc.nextInt();
}
System.out.println(sum);
	
	
	
	}

}
