package level_28_priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 우선순위 큐(Priority Queue)
// 우선순위 큐는 일반적인 큐의 구조인 FIFO(First In First Out)를 따르면서 
// 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조이다.

// 우선순위 큐를 사용하기 위해서는 필수적으로 Comparable 인터페이스를 구현해야한다.
// Comparable 인터페이스를 구현하면 compareTo 메서드를 오버라이드 하게 되고,
// 해당 객체에서 처리할 우선순위 조건을 리턴해주면 우선순위큐는 알아서 우선순위가 높은 객체를 추출 해준다.

// 낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
// PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

// 높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
// PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

// 사용자 정의 인터페이스 사용
// PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//	 @Override
//	 public int compare(Integer o1, Integer o2) {
// 		 return Integer.compare(o2, o1); // 내림차순 정렬
//	 }
// });

// 최소 힙
public class P_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			// 앞에(o1)가 더 크면 바꿔주고 뒤에(o2)가 더 크면 그대로(기본값이 오름차순)
			public int compare(Integer o1, Integer o2) {
				return o2 - o1; // 내림차순
//				return o2 - o1; // 오름차순
			}
		});

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int order = Integer.parseInt(br.readLine());
			if (order == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(order);
			}
		}
	}
}
