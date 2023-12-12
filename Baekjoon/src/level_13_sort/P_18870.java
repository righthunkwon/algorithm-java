package level_13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 좌표 압축
// 맵을 활용하여 key에 원래 수를, value에 해당 수의 빈도를 저장
public class P_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 문제 조건 정의
		int n = Integer.parseInt(br.readLine());
		int[] originArr = new int[n]; // 원본배열
		int[] sortedArr = new int[n]; // 정렬배열
		Map<Integer, Integer> rankMap = new HashMap<>(); // 빈도저장 해시맵
		
		// 배열 요소 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			originArr[i] = tmp;
			sortedArr[i] = tmp;
		}
		
		// 배열 정렬
		Arrays.sort(sortedArr);
		
		// 정렬된 배열을 순회하며 해시맵에 삽입
		int rank = 0;
		for (int tmp : sortedArr) {
			
			// 없을 경우에만 해시맵에 삽입하고 rank를 증가
			if (!rankMap.containsKey(tmp)) {
				rankMap.put(tmp, rank++);
			}
		}
		
		// 원본 배열을 순회하며 해당하는 값에 대한 순위를 스트링빌더에 저장
		for (int tmp : originArr) {
			sb.append(rankMap.get(tmp)).append(' ');
		}
		
		// 정답 출력
		System.out.println(sb);
	}
}
