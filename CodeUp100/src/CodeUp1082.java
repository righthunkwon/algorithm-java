import java.util.Scanner;

public class CodeUp1082 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int num = Integer.parseInt(s, 16);
		// s의 문자열을 16진수로 전환
		
		for(int i=1; i<16; i++) {
			System.out.printf("%X*%X=%X\n", num, i, num*i);
		}
	}

}

	/*
		Integer 클래스의 메소드
			
			Integer 클래스는 Java.lang에 속하는 클래스로, 
			원시적 형(primitive type) int의 값을 객체에 wrap 한다. 
			Integer 유형의 오브젝트에는 유형이 int인 단일 필드가 들어 있다.
			
			
				Integer.parseInt(String s)	 	: String to int, 문자열을 int형으로 변환한다. 
												: 어쩌면 Integer에서 가장 많이 쓰이는 메소드.
												: parseInt(String s, n진수)로 
				
				Integer.toString(int i) 		: int to String, 반대로 int를 String으로 변환한다.
				
				Integer.toBinaryString(int i) 	: 10진수 -> 2진수
				Integer.toOctalString(int i)	: 10진수 -> 8진수
				Integer.toHexString(int i)		: 10진수 -> 16진수
 
	*/
