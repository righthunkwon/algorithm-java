package level_16_stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드2
public class P_2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <=n; i++) {
			q.add(i);
		}
		while (q.size() != 1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}
