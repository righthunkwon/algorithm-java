import java.util.Scanner;

public class CodeUp1027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String arr[] = a.split("\\.");
		String y = arr[0];
		String m = arr[1];
		String d = arr[2];
		System.out.print(d+"-"+m+"-"+y);
		
	}

}

	/*
			다른 풀이
			
			import java.util.Scanner;
			public class Main {
			 
			    public static void main(String args[]) {
			        Scanner scan = new Scanner(System.in);
			        String s = scan.next();    
			        s=s.replace('.', '-');
			        String list[]=s.split("-");
			        System.out.print(list[2]+"-"+list[1]+"-"+list[0]);
			    }
			}

	*/
