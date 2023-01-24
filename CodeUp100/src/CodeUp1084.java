import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp1084 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = br.readLine().split(" ");
		int cnt = 0;
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i=0; i<a; i++) {
			for (int j=0; j<b; j++) {
				for (int k=0; k<c; k++) {
					bw.write(i + " " + j + " " + k + "\n");
					cnt++;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
	} 
}