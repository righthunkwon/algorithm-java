package level_03_loop;

import java.util.Scanner;

public class P_25341 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N/4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
