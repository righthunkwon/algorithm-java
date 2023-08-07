package level_05_string;

import java.io.IOException;
import java.util.Scanner;

public class P_9086 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			String str = scan.next();
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(str.length()-1)+"\n");
		}
	}

}
