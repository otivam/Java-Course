import java.util.Scanner;
public class Work005 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int s =1;
	for(int i = 1; i <= m; i++){
	    s *= n;
	}
	System.out.println(s);
		}
}

