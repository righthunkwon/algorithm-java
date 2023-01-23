import java.util.Scanner;

public class CodeUp1078 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int total = 0;
		for(int i=1; i<=input; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
