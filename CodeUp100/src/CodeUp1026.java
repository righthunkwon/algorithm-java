import java.util.Scanner;

public class CodeUp1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String arr[] = a.split(":");
		
		System.out.println(Integer.valueOf(arr[1]));
		
	}

}

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