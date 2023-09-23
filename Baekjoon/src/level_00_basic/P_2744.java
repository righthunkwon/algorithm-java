package level_00_basic;

import java.util.Scanner;

// 대소문자 바꾸기
// Character class의 메소드 활용
// isUpperCase, isLowerCase, toUpperCase, toLowerCase
public class P_2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c) ) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb);
	}
}
