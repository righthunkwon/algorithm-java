package level_10_geometry_rect_tri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대지
// 넓이가 최소가 되는 직사각형은
// x좌표의 최소,최대와 y좌표의 최소,최대를 구하면 알 수 있다.
public class P_9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
		}
		System.out.println((maxX - minX)*(maxY - minY));
	}
}
