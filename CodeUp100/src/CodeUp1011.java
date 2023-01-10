import java.util.Scanner;

public class CodeUp1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Scanner는 문자를 입력받는 기능이 없다(문자열만 가능).
		// String 에서 char로 casting 할 수 없다. --->  char letter = (char)input; 불가능
			
		System.out.print("문자 입력 : ");
		String input = scan.next();
		char letter = input.charAt(0);
		System.out.printf("%c", letter);
	}
	
}

	/*
		.charAt()
		
			Scanner에서는 char타입으로는 입력을 받을 수 없고 String 타입으로 입력받는 것이 2개나 존재한다.
			일반 사용자가 데이터를 입력할 때를 생각해보면 굳이 한 글자만 입력할 수 있는 기능을 넣기 보다는, 그냥
			문자열(단어, 문장)으로 입력받는 것이 훨씬 효율적일 것이기 때문이다. 하지만, 이때 개발자에게는 문제가
			발생한다. 바로 char타입을 사용할 수 없게 되는 것이다. 따라서 만약에 char 타입을 입력받아야 할 때는
			약간의 변형 과정을 거치게 되는데, 이때 필요한 것이 바로 .charAt(n)이다. .charAt(n)은 String
			으로 저장된 문자열 중에서 n번째인 한 문자만 선택하여 char타입으로 변환하게 해준다. 
	*/