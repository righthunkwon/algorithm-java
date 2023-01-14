import java.util.Scanner;

public class CodeUp1033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(Integer.toHexString(num).toUpperCase());
	}

}
	
	/*
			대문자, 소문자 변환 : 내장함수 이용
				
				toUpperCase() : 문자열을 모두 대문자로 변환
				toLowerCase() : 문자열을 모두 소문자로 변환
	*/
