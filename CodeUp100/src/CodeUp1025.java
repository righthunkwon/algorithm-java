import java.util.Scanner;

public class CodeUp1025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int arr[] = new int[a.length()];
		
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(i)-'0';
		}
		System.out.println("["+10000*arr[0]+"]");
		System.out.println("["+1000*arr[1]+"]");
		System.out.println("["+100*arr[2]+"]");
		System.out.println("["+10*arr[3]+"]");
		System.out.println("["+arr[4]+"]");
	}

}

	/*
		.charAt()
		
			: Scanner에서는 char타입으로는 입력을 받을 수 없다.
			: 따라서 Scanner로 입력받은 값을 char 타입으로 변환해야 할 떄는 
			  n번째 문자를 선택하여 char타입으로 변환하게 해주는 .charAt(n)
			  을 활용해야 한다.
			: charAt() -'0'을 활용하면 char형을 int형으로 변환할 수 있다.
		 	  숫자 1의 아스키코드는 49, 숫자 2는 50, 숫자 3은 51, ...이다.
		 	  이때 '0'의 아스키코드인 48만큼을 뺴주면 char형으로 리턴된 문자를
		 	  int형의 정상적인 숫자로 파악할 수 있다.
		   
		 	: char a = 3; (아스키코드 51)
		 	  a2 - '0' 	= 3;
		 	  a2 - 48 	= 3;
		 	  
	*/