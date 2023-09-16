package level_16_stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택 2
// 직접 스택을 구현하는 게 문제가 요구하는 바이지만
// 스택(10828번) 문제에서 구현해봤고, 스택 클래스의 메소드를 연습하기 위해 스택 클래스를 활용하였다.
public class P_28278 {
	public static void main(String[] args) throws IOException {
		// 명령의 입력이 최대 1,000,000이므로 BufferedReader를 사용했다.
		// 명령의 출력도 최대 1,000,000이므로 StringBuilder를 사용했다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		// 스택
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine()); // 명령의 수
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			switch(Integer.parseInt(st.nextToken())) {
				case 1:
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					if (stack.size() != 0) sb.append(stack.pop()).append(("\n"));
					else sb.append(-1).append("\n");
					break;
				case 3:
					sb.append(stack.size()).append("\n");
					break;
				case 4:
					if (stack.empty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				case 5:
					if (stack.size() != 0) sb.append(stack.peek()).append("\n");
					else sb.append(-1).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
}