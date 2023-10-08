package level_12_bruteforce;

import java.util.Scanner;

// 나누기
public class P_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정수
		int f = sc.nextInt(); // 나누는 수

		// n의 마지막 두 자리 수를 제거
		n /= 100;
		n *= 100;

		// 나누어 떨어질 때까지 n을 1씩 증가시키며 확인
		while (n % f != 0) {
			n += 1;
		}
		
		// 문자열로 바꾸고 마지막 두 자리 출력
		String s = String.valueOf(n);
		System.out.println(s.substring(s.length()-2, s.length()));
	}
}
