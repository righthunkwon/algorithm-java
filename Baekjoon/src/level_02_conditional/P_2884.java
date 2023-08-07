package level_02_conditional;

import java.util.Scanner;

public class P_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if (m >= 45) {
			m -= 45;
		} else if (m < 45) {
			m += 15;
			if(h <= 0) {
				h += 23;
			} else {
				h -= 1;
			}
		} 
		
		System.out.println(h + " " + m);
	}

}
