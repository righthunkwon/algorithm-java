package level_16_stack_queue_deque;

import java.util.Scanner;
import java.util.Stack;

// 제로
public class P_10773 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Stack<Integer> stack = new Stack<>();
		 int k = sc.nextInt();
		 int ans = 0;
		 for (int i = 0; i < k; i++) {
			 int tmp = sc.nextInt();
			 if (tmp == 0) stack.pop();
			 else stack.add(tmp);
		 }
		 while(!stack.isEmpty()) ans += stack.pop();
		 System.out.println(ans);
	}
}
