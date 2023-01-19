import java.util.Scanner;

public class CodeUp1046 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double n = (double)(a+b+c)/3.0;
		
		System.out.println(a+b+c);
		System.out.printf("%.1f", n);
	}

}
