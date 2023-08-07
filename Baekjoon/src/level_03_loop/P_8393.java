package level_03_loop;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class P_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		
		for (int i=1; i<=n; i++) {
			result += i;
		}
		System.out.println(result);
	}

}