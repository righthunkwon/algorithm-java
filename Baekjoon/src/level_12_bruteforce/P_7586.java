package level_12_bruteforce;

import java.util.Scanner;

// 덩치
public class P_7586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람의 수
		int[] weight = new int[n]; // 무게
		int[] height = new int[n]; // 키
		int[] rank = new int[n]; // 전체 순위

		// 배열 요소 입력
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}

		// 몸무게와 키의 순위를 구해서 rank 배열에 저장
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				// 무게와 키가 모두 큰 사람이 있을 경우 순위를 1 더한다.
				if (weight[i] < weight[j] && height[i] < height[j]) {
					rank[i]++;
				}
			}
		}
		
		// 초기값은 0부터 시작하므로 순위에 +1을 하여 정답을 출력
		for (int r : rank) {
			System.out.print(r+1 + " ");
		}
	}
}