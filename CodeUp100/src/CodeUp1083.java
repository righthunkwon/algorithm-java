import java.util.Scanner;

public class CodeUp1083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i=1; i<=input; i++) {
			if(i%3!=0) {
				System.out.print(i + " ");
			} else {
				System.out.print("X ");
			}
		}
	}

}
