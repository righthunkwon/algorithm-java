package level_05_string;

import java.util.Scanner;

public class P_11654 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = scan.next().charAt(0);
		System.out.println(ch);
	}

}

/*
	Scanner 에는 문자를 받으려면 nextLine() 이나 next() 를 통해 문자열로 입력받아서 charAt() 으로 문자로 잘라내주어야 한다.

	즉, 과정은 아래와 같다.

		1. scan.next()	: String 으로 입력받는다.
		2. charAt() 	: String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
		3. int ch 		: int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
*/
