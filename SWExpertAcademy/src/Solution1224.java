import java.util.Scanner;
import java.util.Stack;

// 계산기 3
public class Solution1224 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// test case
		int tc = 10;
		for (int t = 1; t <= tc; t++) {
			sc.nextInt(); // 계산식 문자열 길이
			String infix = sc.next(); // 계산식 문자열
			System.out.printf("#%d %d\n", t, Calculate(ChangeInToPost(infix)));
		}
	}

	// 연산자의 우선순위를 확인하는 메소드
	private static int CheckPriority(char ch) {
		if (ch == '(')
			return 0;
		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;
		return -1; // 잘못된 값 입력
	}

	// 중위표기식(infix)을 후위표기식(postfix)으로 변경하는 메소드
	// 후위표기식(피연산자+연산자)은 sb에 담고, 연산자는 stack에 담는다.
	private static String ChangeInToPost(String infix) {
		Stack<Character> stack = new Stack<>(); // 연산자
		StringBuilder sb = new StringBuilder(); // 후위표기식

		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			if (Character.isDigit(ch)) { // 숫자
				sb.append(ch);
			} else if (ch == '(') { // 여는 괄호
				stack.push(ch);
			} else if (ch == ')') { // 닫는 괄호
				// 여는 괄호가 나올 때까지 후위표기식에 추가
				while (stack.peek() != '(') {
					sb.append(stack.pop());
				}
				// 여는 괄호 지우기
				stack.pop();
			} else { // 연산자(+,-.*./,()
				// 스택이 비어있지 않고, 현재 연산자의 우선순위가 스택 연산자의 우선순위보다 높으면 스택에 연산자 추가
				if (!stack.isEmpty() && CheckPriority(ch) >= CheckPriority(stack.peek())) {
					stack.push(ch);
					
				// 스택이 비어있지 않고, 현재 연산자의 우선순위가 스택 연산자의 우선순위보다 낮으면 
				// 현재 연산자보다 우선순위가 같거나 작은 연산자를 만날 때까지 꺼내고 이를 후위연산자에 추가
				} else {
					while (!stack.isEmpty() && CheckPriority(ch) <= CheckPriority(stack.peek())) {
						sb.append(stack.pop());
					}
					stack.push(ch); // 작업을 마친 뒤 현재 연산자를 스택에 넣는다
				}
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		String postfix = String.valueOf(sb);
		return postfix;
	}

	// 후위표기식을 계산하는 메소드
	private static int Calculate(String postfix) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);

			if (Character.isDigit(ch)) { // 숫자
				// 후위표기식에서 숫자를 입력 받았을 경우
				stack.push(ch - '0'); // 문자를 숫자로 변환하여 스택에 담는다.

			} else {
				// 후위표기식에서 연산자를 입력 받았을 경우
				// 스택에서 숫자 두 개를 꺼낸 뒤, 연산을 하고 해당 연산의 결과를 다시 계산기 스택에 담는다.
				int n2 = stack.pop();
				int n1 = stack.pop();
				if (ch == '+') {
					stack.push(n1 + n2);
				} else if (ch == '-') {
					stack.push(n1 - n2);
				} else if (ch == '*') {
					stack.push(n1 * n2);
				} else {
					stack.push(n1 / n2);
				}
			}
		}
		return stack.pop();
	}
}