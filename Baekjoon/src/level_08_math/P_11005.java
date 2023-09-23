package level_08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 진법 변환 2
public class P_11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 10진수
		int b = Integer.parseInt(st.nextToken()); // 진법

		// 정답을 출력할 배열
		List<Character> list = new ArrayList<>();
		
		while (n > 0) {
			if (n % b < 10) {
				list.add((char) (n % b + '0')); // 10 미만이면 숫자로 만들기
			} else {
				list.add((char) (n % b - 10 + 'A')); // 10 이상이면 문자로 만들기
			}
			n /= b; // 한 자리 수 기록 완료
		}

		// 거꾸로 순회하며 정답 출력
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
		}

	}
}
