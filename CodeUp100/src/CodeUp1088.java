import java.util.Scanner;

public class CodeUp1088 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		for(int i=1; i<=max; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
