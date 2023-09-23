package level_16_stack_queue_deque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 문제0
// 문제에서 설명하듯 요세푸스 순열은 원형으로 이루어진 순환하는 순열에 해당한다.
// 원하는 요소가 나올 때까지 큐에서 요소를 삭제하고, 이후 삭제한 요소를 뒤에 붙여주는 방식으로 구현하면 된다.
public class P_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 큐 요소 입력
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		// 정답 출력
		StringBuilder sb = new StringBuilder();
		sb.append("<");		
		
		// 구현
		while (!q.isEmpty()) {
			// k == 1일 때의 예외처리
			if (k == 1) {
				while (!q.isEmpty()) {
					if (q.size() == 1) {
						sb.append(q.poll());
					} else {
						sb.append(q.poll()).append(", ");
					}
				}
				break;
			}
			
			// k-1번은 뺀 거 더해주는 작업 반복
			for (int i = 0; i < k-1; i++) {
				int tmp = q.poll();
				q.add(tmp);
			}
			// k번째 작업은 빼고 스트링빌더에 추가
			// 요세푸스 순열의 마지막 요소일 때는 , 제거하여 추가
			if (q.size() == 1) {
				sb.append(q.poll());
			} else {
				sb.append(q.poll()).append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
