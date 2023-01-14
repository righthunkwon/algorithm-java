import java.util.Scanner;

public class CodeUp1031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(Integer.toOctalString(num));
		
	}

}
	
	/*
			자바의 n진수 변환 	
			
				(1) integer 클래스의 메소드 활용 (String 형태로 변환)
						
						2진수 변환 : Integer.toBinaryString(int num) -> String 형태
						8진수 변환 : Integer.toOctalString(int num) ->String 형태
						16진수 변환 : Integer.toHexString(int num) -> String 형태


				(2) System.out.printf("%출력타입", num);
				
						System.out.printf("%출력타입", num);
						
						형식 : %d:10진수, %o:8진수, %x:16진수(소문자), %X:16진수(대문자)
				
	*/
