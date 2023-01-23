import java.util.Scanner;

public class CodeUp1080 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		for(int i=1; ; i++) {
			sum += i;
			if(sum>=input) {
				System.out.println(i);
				break;
			}
		}
	}
}
