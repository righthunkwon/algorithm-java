package level_4;

import java.util.Scanner;

public class P_5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[30];
		
		for(int i=0; i<30; i++) {
			int present = scan.nextInt();
			arr[present] = 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
