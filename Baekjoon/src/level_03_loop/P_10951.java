package level_03_loop;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class P_10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				int A = scan.nextInt();
				int B = scan.nextInt();
				System.out.println(A+B);
			} catch (NoSuchElementException nsee) {
				scan.close();
				break;
			}
		}
	}

}
