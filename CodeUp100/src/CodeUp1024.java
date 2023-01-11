import java.util.Scanner;

public class CodeUp1024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		char[] b = a.toCharArray();
		for(int i=0; i<=a.length()-1; i++) {
			System.out.println("\'"+b[i]+"\'");
		}
	}

}

	/*
		다른 풀이
		
		import java.util.Scanner;
 
		public class CodeUp1024 {
		
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        
		        String a = scan.next();
		        String b[] = a.split("");
		        // split을 처리하면 배열에 저장하여 리턴. 
		       	// split("")으로 나누면 문자열을 문자로 나눠 배열에 저장하는 효과
		        
		        for(int i=0;i<a.length;i++) {
		        	System.out.println("'"+a[i]+"'");
		        }
		        
    		}
		}

	*/