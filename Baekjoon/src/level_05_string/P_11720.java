package level_05_string;

import java.util.Scanner;

public class P_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num = scan.next();
		int total = 0;
		for(int i=0; i<n; i++) {
			char c = num.charAt(i);
			total += (int)c-'0';
		}
		System.out.println(total);
	}
	
	/*
		charAt()은 해당 문자의 아스키코드 값을 반환하므로
		반드시 -48 또는 -'0'을 해주어야 우리가 입력받은 숫자값 그대로를 사용할 수 있다.
	*/
}
