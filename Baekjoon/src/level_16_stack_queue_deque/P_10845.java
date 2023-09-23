package level_16_stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 큐
// 스택은 LIFO로, top에서 삽입과 삭제가 동시에 일어나므로 top에 해당하는 size 하나가 인덱스가 될 수 있었지만,
// 큐는 FIFO이기 때문에 삽입은 last에서 삭제는 first에서 발생하므로 last와 first 두 개의 인덱스가 필요하다.

// 큐를 구현하기 위해 배열을 만들 경우 
// 자바의 배열 자료형의 특성 상 실제 배열 내부의 값을 삭제시킬 수는 없으므로
// 실제로는 first와 last의 인덱스를 바탕으로 요소를 검색하여 배열을 관리해야 한다.

// first는 삭제되어야 할 자료이므로 실제 값의 인덱스를 가르켜야 하지만,
// last는 이후에 요소가 추가될 때 추가할 인덱스이므로 아직 존재하지 않는 공간이다.
// 따라서 size 역시 first - last + 1이 아니라 first - last로 구현해야 한다.
public class P_10845 {
	private static int[] queue = new int[10001];
	private static int first = 0;
	private static int last = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch (str) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}

	// 큐의 삽입
	public static void push(int x) {
		queue[last] = x;
		last++;
	}

	// 큐의 삭제
	public static int pop() {
		// 자료가 없을 때
		if (last - first == 0) {
			return -1;
		} 
		
		// 자료가 있을 때
		else {
			int num = queue[first];
			first++;
			return num;
		}
	}

	// 큐의 크기
	public static int size() {
		return last - first;
	}

	// 큐가 비어있는지 아닌지
	public static int empty() {
		if (last - first == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// 큐의 가장 앞 정수 출력
	public static int front() {
		// 자료가 없을 때
		if (last - first == 0) {
			return -1;
		} 
		
		// 자료가 있을 때
		else {
			return queue[first];
		}
	}

	// 큐의 가장 뒤 정수 출력
	public static int back() {
		// 자료가 없을 때
		if (last - first == 0) {
			return -1;
		} 
		
		// 자료가 있을 때
		else {
			// last는 자료가 추가될 때 사용하는 인덱스이므로
			// 실제 존재하는 자료의 마지막 인덱스는 last - 1에 해당한다.
			int num = queue[last - 1];
			return num;
		}
	}

}
