package level_16_stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
// 여는 괄호가 나오면 스택에 쌓고, 닫는 괄호가 나오면 여는 괄호를 하나 지운다
public class P_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '(') stack.add(ch[j]);
				else if (stack.isEmpty()) flag = false;
				else stack.pop();
			}
			if (stack.isEmpty() && flag == true) System.out.println("YES"); 
			else if (!stack.isEmpty() || flag == false) System.out.println("NO");
		}
	}
}