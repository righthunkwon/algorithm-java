import java.util.Scanner;

public class CodeUp1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int s = scan.nextInt();
		
		float num = (float)h*b*c*s/8/1024/1024;
		System.out.printf("%.1f MB", num);
	}

}
