package level_16_stack_queue_deque;

import java.util.Scanner;

// 스택
// https://st-lab.tistory.com/175
// 스택을 사용하는 것이 아니라 스택을 구현하는 문제
public class P_10828 {
	private static int[] stack = new int[10001];
	private static int size;
	private static StringBuilder sb = new StringBuilder();

	
	// 사이즈 개념 다시 생각해야할듯 님...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 명령의 수
		for (int i = 0 ; i < n; i++) {
			String order = sc.next();
			if (order.equals("push")) {
				int X = sc.nextInt();
				push(X);
			} else if (order.equals("pop")) {
				pop();
			} else if (order.equals("size")) {
				size();
			} else if (order.equals("empty")) {
				empty();
			} else if (order.equals("top")) {
				top();
			}
		}
		System.out.println(sb);
	}

	private static void push(int X) {
		// 정수 X를 스택에 넣는다(인덱스는 1부터 시작, 구현하기 위해 스택의 크기를 하나 늘렸다).
		size++; // 사이즈를 증가시키고
		stack[size] = X; // 요소를 삽입한다.
	}

	// 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력, 만약에 스택에 수가 없다면 -1 출력
	private static void pop() {

		// 스택에 수가 없다면 -1을 출력한다.
		if (size == 0) {
			sb.append("-1").append("\n");
		} 
		
		// 스택에서 가장 위에 있는 정수를 출력하고 스택의 사이즈를 하나 줄인다.
		else {
			sb.append(stack[size]).append("\n");
			size--;
		}
	}

	// 스택에 들어있는 정수의 개수 출력
	private static void size() {
		sb.append(size).append("\n");
	}

	
	// 스택이 비어있는지 확인(비어있으면 1, 비어있지 않으면 0)
	private static void empty() {
		if (size == 0) {
			sb.append("1").append("\n");
		} else {
			sb.append("0").append("\n");
		}
	}

	
	// 스택의 가장 위에 있는 정수를 출력, 만약 정수가 없다면 -1 출력
	private static void top() {

		// 스택에 수가 없다면 -1을 출력한다.
		if (size == 0) {
			sb.append("-1").append("\n");
		} 
		
		// 스택에서 가장 위에 있는 정수를 출력한다.
		else {
			sb.append(stack[size]).append("\n");
		}
	}
}