import java.util.Scanner;

public class CodeUp1070 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		switch(a) {
		
		case 12 :
		case 1 :
		case 2 :
			System.out.println("winter");
			break;
			
		case 3 :
		case 4 :
		case 5 :
			System.out.println("spring");
			break;
		
		case 6 :
		case 7 :
		case 8 :
			System.out.println("summer");
			break;
			
		case 9 :
		case 10 :
		case 11 :
			System.out.println("fall");
			break;
		}
	}

}


	/*
			case문에 break;를 수행하지 않으면 다음 case문으로 넘어간다.
	*/

