package level_1;

import java.util.Scanner;

public class P_3003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<chess.length; i++) {
			int whitePieces = scan.nextInt();
			System.out.println(chess[i]-whitePieces);
		}
		
	}

}

	/*
		
	*/
