package level_05_string;

import java.util.Scanner;

// 펠린드롬 수
public class P_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if(str.equals("0")) break;
			
			String ans = "yes";
			char[] carr = str.toCharArray();
			for (int i = 0; i < carr.length / 2; i++) {
				if (carr[i] != carr[carr.length-1-i]) {
					ans = "no";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
