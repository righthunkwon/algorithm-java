import java.util.Scanner;
 
public class P_1291 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        int s; 
        int e;
        
        while(true) {
            s = scan.nextInt();
            e = scan.nextInt();
            if((s>=2 && s<=9) && (e>=2 && e<=9)) {
            	break;
            } else {
            	System.out.println("INPUT ERROR!");
            }
        }
         
        if(s<=e) {
            for(int i=1; i<=9; i++) {
                for(int j=s; j<=e; j++) {
                    System.out.printf("%d * %d = %2d", j, i , j*i);
                    if(j!=e) System.out.print("   ");
                }
                System.out.println();
            }
        } else if (s>e){
            for(int i=1; i<=9; i++) {
                for(int j=s; j>=e; j--) {
                    System.out.printf("%d * %d = %2d", j, i , j*i);
                    if(j!=e) System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}