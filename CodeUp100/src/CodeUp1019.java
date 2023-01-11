import java.util.Scanner;

public class CodeUp1019 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] arr = a.split("\\.");
		
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		int C = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}
}

	/*
		split
			
			(1) String[] split(String regex)
				
				: split 함수는 구분자(String regex에 해당)를 바탕으로 문자열을 나누어 배열에 저장하여 리턴한다.
				: 가령, 010-1234-5678이라는 번호가 있다고 가정하고 이를 split("-")하면
				  이는 "010", "1234", "5678"로 나누어져 배열에 저장된다.
			
			(2) String[] split(String regex, int limit)
			
				: 구분자 뒤에 두 번째 인자값으로 배열의 크기를 설정할 수 있다.
		
	*/


	/*
		int와 Integer의 차이는 무엇인가 (Integer 사용법)
		
			int		: 변수의 타입(자료형)
					: 자료형은 data의 type에 따라 값이 저장될 공간의 크기와 저장 형식을 정의한 것 (자료형 : 기본형, 참조형)
					: 기본 자료형(boolean, char, byte, short, int, long, float, double)
					: 산술 연산이 가능, null로 초기화 불가
					
					
			Integer	: int의 래퍼 클래스(wrapper class)
					: 1. 매개변수로 객체를 필요로 할 때, 
					: 2. 기본형 값이 아닌 객체로 저장해야할 때, 
					: 3. 객체 간 비교가 필요할 때 사용
					: 언박싱하지 않을 시 산술 연산이 불가, null값 처리 가능
					
						cf) Boxing		: primitive type ->	wrapper class 변환 (int to Integer)
							Unboxing	: wrapper class -> primitive type 변환 (Integer to int)

	*/

	/*
		Integer 클래스의 메소드
			
			1. Integer.parseInt(String s)	: String 타입의 문자열을 int 형으로 변환
			2. Integer.toString(int i)		: int 타입의 문자열을 String 형으로 변환
			3. Integer.max(int a, int b)	: 입력 받은 2개 정수 중 더 큰 값을 리턴
			4. Integer.min(int a, int b)	: 입력 받은 2개 정수 중 더 작은 값을 리턴
										  (...)
	*/

	/*
		parseInt()	: 원시데이터인 int 타입을 반환(기본 정수값)
		valueOf()	: Integer 래퍼(Wrapper) 객체를 반환(객체)
		
		valueOf() 메소드
		
			valueOf(boolean)
			valueOf(double)
			valueOf(float)
			valueOf(int)
			valueOf(long)
			valueOf(String)
	
			valueOf() 메소드는 괄호 안의 해당 객체를 String 객체로 변환시키는 역할을 한다. 
			가령, 어떤 정수를 String의 객체로 표현하고 싶으면 valueOf(5);라 기술하면 된다.
			이후 5라는 정수는 String이라는 "5" 로 인식된다. 이렇듯 valueOf() 메소드는 어떤
			객체를 String 객체로 형변환 시켜준다.

	*/









