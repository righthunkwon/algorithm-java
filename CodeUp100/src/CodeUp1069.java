import java.util.Scanner;

public class CodeUp1069 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.nextLine().charAt(0);
		switch(a) {
		
		case 'A' :
			System.out.println("best!!!");
			break;
			
		case 'B' :
			System.out.println("good!!");
			break;
			
		case 'C' :
			System.out.println("run!");
			break;
			
		case 'D' :
			System.out.println("slowly~");
			break;
			
		default :
			System.out.println("what?");
			break;
		}
	}
}

	/*
		문자열을 문자로 바꾸는 방법	: .charAt()
		
		문자열이 아니라 문자에 따라 조건을 부여할 때는 if문 대신 switch문을
		이용하면 편리하다. 
	*/
