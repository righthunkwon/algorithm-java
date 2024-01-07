package level_25_greedy;

import java.util.Scanner;

// 폴리오미노
// 정규식에 해당하는 문자열의 경우에는 \\를 붙여줘야 한다.
public class P_1343 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		sc.close();
		sb.append(poliomino(s));
		System.out.println(sb);
	}
	
	private static String poliomino(String s) {
		String res = "";
		String A = "AAAA";
		String B = "BB";
		s = s.replaceAll("XXXX", A);
		res = s.replaceAll("XX", B);
		if (res.contains("X")) {
			res = "-1";
		}
		return res;
	}
}
