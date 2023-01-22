import java.util.Scanner;

public class CodeUp1064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a>b ? (b>c ? c : b) : (a<c ? a : c));
	}

}
