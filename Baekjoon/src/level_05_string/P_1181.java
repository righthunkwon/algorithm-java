package level_05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 단어 정렬
// 배열을 특정한 규칙에 따라 정렬하고 싶을 경우 Comparator을 활용하자

// Arrays.sort()는 문자열을 사전 순으로 정렬해주는데, 
// 이때 Comparator는 default Comparator가 사용된 것이다.

// Arrays.sort()의 매개변수에 두 번째 매개변수로 Comparator를 재정의해서
// 추가적인 기준을 마련해줄 경우 배열을 원하는 기준에 따라 쉽게 정렬할 수 있다.
public class P_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 배열 요소 입력
		String[] sarr = new String[n];
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = br.readLine();
		}

		// 배열 요소 정렬
		Arrays.sort(sarr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}

			}
		});

		// 배열 요소의 중복을 제거하여 출력
		System.out.println(sarr[0]);
		for (int i = 1; i < sarr.length; i++) {
			if (!sarr[i].equals(sarr[i - 1])) {
				System.out.println(sarr[i]);
			}
		}
	}
}
