package level_06_advanced;

import java.util.Scanner;

// 크로아티아 알파벳
// 정석은 문자열을 문자로 쪼개서 이후 요소를 기준으로 이전 요소가 크로아티아 알파벳을 만족할 때 길이를 줄이는 방식으로 풀이
public class P_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replaceAll("c=", "@");
		str = str.replaceAll("c-", "@");
		str = str.replaceAll("dz=", "@");
		str = str.replaceAll("d-", "@");
		str = str.replaceAll("lj", "@");
		str = str.replaceAll("nj", "@");
		str = str.replaceAll("s=", "@");
		str = str.replaceAll("z=", "@");
		System.out.println(str.length());
	}
}