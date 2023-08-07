package level_04_array;

import java.util.Scanner;

public class P_5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[31];
		
		for(int i=1; i<29; i++) {
			int present = scan.nextInt();
			arr[present] = 1;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
