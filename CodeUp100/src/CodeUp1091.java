import java.util.Scanner;

public class CodeUp1091 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		long result = a * m + d;
		
		if(n==1) {
			System.out.println(a);
		} else {
			for(int i=2; i<n; i++) {
				result = result * m + d;
			}
			System.out.println(result);
		}
		
	}

}
