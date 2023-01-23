import java.util.Scanner;

public class CodeUp1076 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char input = scan.nextLine().charAt(0);
		for(char i='a'; i<=input; i++) {
			System.out.print(i+" ");
		}
	}
	
}

	/*
		1. print를 println으로 쓰는 실수에 유의하자.
		2. for문에는 char를 넣을 수도 있다.
	*/
