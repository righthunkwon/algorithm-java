import java.util.Scanner;

public class CodeUp1086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int b = scan.nextInt();
		
		double res = (double)w*h*b/8/1024/1024;
		System.out.printf("%.2f MB", res);
	}

}
