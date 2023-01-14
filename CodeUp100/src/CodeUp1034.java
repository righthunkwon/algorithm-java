import java.util.Scanner;

public class CodeUp1034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		// Integer.parseInt : String to int
		// 문자열로 입력받은 뒤, Integer.parseInt(문자열, 원하는 진수)
		int num = Integer.parseInt(input, 8);
		System.out.println(num);
	}

}

	/*
			Integer 클래스(Wapper Class of int)
				
				: Java.lang에 속하며 원시형(primitive type) int의 값을 int의 값을 객체에 wrap한다.
				
				
			Integer 클래스의 다양한 메소드
				Integer.parseInt(String S)	 : String to int
				Integer.toString(int n)		 : int to String
				Integer.toBynaryString(int n): 10진수를 2진수로 변환하여 String으로 리턴
				Integer.toOctalString(int n) : 10진수를 8진수로 변환하여 String으로 리턴
				Integer.toHexString(int n)   : 10진수를 16진수로 변환하여 String으로 리턴
				Integer.max(int a, int b)	 : 최댓값 출력
				
				(...)
	*/
