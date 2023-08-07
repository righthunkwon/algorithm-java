package level_03_loop;

import java.util.Scanner;

public class P_10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			arr[i] = A + B;
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}
	}

}
