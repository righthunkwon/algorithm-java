package level_00_basic;

import java.io.*;
import java.util.*;

// 너의 핸들은
public class P_15819 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		String[] sarr = new String[N+1];
		sarr[0] = "";
		for (int i = 1; i <= N; i++) sarr[i] = br.readLine();
		Arrays.sort(sarr);
		System.out.println(sarr[L]);
	}
}
