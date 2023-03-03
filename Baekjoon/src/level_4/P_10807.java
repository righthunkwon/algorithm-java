package level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int searchNum = Integer.parseInt(br.readLine());
		int cnt = 0; // seachNum과 일치할 시 ++;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == searchNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}

}
