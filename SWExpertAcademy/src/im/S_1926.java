package im;

import java.util.Scanner;

// 간단한 369게임
public class S_1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 마지막 숫자
		StringBuilder sb = new StringBuilder(); // 공백을 기준으로 숫자를 차례대로 담을 String Builder
		for (int i = 1; i <= n; i++) {
			sb.append(i + " ");
		}

		// String Builder를 String에 담고 replace 메소드를 사용해 3, 6, 9를 -로 대체
		String str = String.valueOf(sb);
		str = str.replace("3", "-");
		str = str.replace("6", "-");
		str = str.replace("9", "-");

		// 문자열을 공백을 기준으로 분리하고 만약 배열의 요소가 -를 포함할 경우
		// 해당 문자열을 문자 배열로 분리해 -의 개수를 세고 배열의 요소를 -의 개수에 맞게 변경
		String[] sarr = str.split(" ");
		for (int i = 0; i < sarr.length; i++) {

			// 배열의 요소가 -를 포함할 경우
			if (sarr[i].contains("-")) {
				// 배열의 요소를 쪼개 문자 배열에 담아 -의 개수를 세고 배열의 요소를 -의 개수에 맞게 변경
				int cnt = 0; // -의 개수
				char[] carr = new char[sarr[i].length()]; // 문자 배열
				carr = sarr[i].toCharArray(); // 문자 배열에 문자열을 쪼갠 요소 담기

				for (int j = 0; j < sarr[i].length(); j++) {
					if (carr[j] == '-') {
						cnt++;
					}
				}
				if (cnt == 1)
					sarr[i] = "-";
				if (cnt == 2)
					sarr[i] = "--";
				if (cnt == 3)
					sarr[i] = "---";
				if (cnt == 4)
					sarr[i] = "----";
			}
		}
		sb.delete(0, sb.length());
		for (int i = 0; i < sarr.length; i++) {
			sb.append(sarr[i] + " ");
		}
		System.out.println(sb);
		String ans = String.valueOf(sb);
		System.out.println(ans.trim());
	}
}