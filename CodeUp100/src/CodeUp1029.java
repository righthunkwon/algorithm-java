import java.util.Scanner;

public class CodeUp1029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.println(String.format("%.11f", num));
	}

}

	/*
		String.format()
			
				String 의 static 메서드인 format 메서드는 문자열의 형식을 설정하는 메서드이다.
				String.format(%d/s/f/t/c/o/x, 
					
				서식문자열	
					: 기본적으로 오른쪽 정렬, -를 붙이면 왼쪽 정렬, %'정수부자리'.'소수점아래자리''서식문자열' 의 형태로 기술
					: %15.2f는 글자길이 15, 소수점 아래 두 자리까지 나타냄
			
					%b (불린 형식) 
					%d (10진수 형식)(정수)
					%c (문자 형식)
					%s (문자열 형식)
					%f (실수형 형식)
					%t (날짜시간 형식)
					%c (유니코드 문자 형식)
					%o, %x(8진수, 16진수 형식)
			
	*/
