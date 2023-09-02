package level_12_bruteforce;

import java.util.Scanner;

// 블랙잭
// 브루트포스
public class P_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드의 개수
		int m = sc.nextInt(); // 합의 최대
		int[] cards = new int[n]; // 카드 배열

		// 카드 배열 요소 입력
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}

		// 정답 변수
		int ans = 0;
		
		// i, j, k가 서로 중복되지 않도록 배열 전체를 세 번 완전탐색
		l: for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					
					// 반복문을 순회하며 세 합을 임시 변수에 저장
					int tmp = cards[i] + cards[j] + cards[k];
					
					// 주어진 합의 최대와 세 합이 같을 경우
					// 정답에 세 합을 담고 반복문 탈출
					if (m == tmp) {
						ans = tmp;
						break l;
					}
					
					// 기존에 저장된 합의 최대보다 새로 구한 합의 최대가 크고
					// 이 합이 문제에서 주어진 최대 합(m)보다 작을 경우
					// 정답에 새로 구한 세 수의 합을 저장하여 값을 갱신
					if (ans < tmp && tmp < m) {
						ans = tmp;
					}
				}
			}
		}
		
		// 정답 출력
		System.out.println(ans);

	}
}
