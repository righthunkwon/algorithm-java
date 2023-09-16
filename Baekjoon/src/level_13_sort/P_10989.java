package level_13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 3
// 카운팅 배열을 활용한 정렬
public class P_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 수의 개수
		StringBuilder sb = new StringBuilder(); // 정답을 저장할 스트링빌더
		
		
		// 카운팅 배열
		int[] cnt = new int[10001];
		for (int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		// 0보다 클 때까지 계속해서 숫자를 스트링빌더에 저장하고 하나씩 줄여나감
		for (int i = 1; i < 10001; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
		// 정답 출력
		System.out.println(sb);
	}
}