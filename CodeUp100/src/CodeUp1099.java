import java.util.Scanner;
 
public class CodeUp1099 {
 
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
 
      int arr[][]=new int[10][10];
      int num=1;
      
      for(int i=0;i<10;i++){
         for(int j=0;j<10;j++) {
            arr[i][j]=sc.nextInt();
         }
      }
      Loop1:      
      for(int i=1;i<9;i++) {
          Loop2:
         for(int j=num;j<10;j++) {
            
            if(arr[i][j]==0) {
               arr[i][j]=9;
            }
            
            else if(arr[i][j]==1) {
                if(arr[i+1][j-1]==0)
                    arr[i+1][j-1]=9;
               num=j-1;
               break;
            
            }
            
            else if(arr[i][j]==2) {
               arr[i][j]=9;
               break Loop1;
            }
         }
      }
      for(int i=0;i<10;i++) {
         for(int j=0;j<10;j++) {
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
   }
}
 
