package prim_dijkstra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


// Contact
// 가장 나중에 연락을 받는 사람 중 가장 번호가 큰 사람
public class S_1238 {

	private static int n, st;
	private static int[] dist;
	private static List<Integer>[] adjList;
	private static boolean[] visited;
	
	private static class Node {
		int v;
		int w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// test case
		int tc = 10;
		for (int t = 1; t <= tc; t++) {
			n = sc.nextInt(); // 간선의 개수
			st = sc.nextInt(); // 시작점
			dist = new int[101]; // 가중치 배열
			visited = new boolean[101];// 방문 배열

			for (int idx = 0; idx <= 100; idx++) {
				dist[idx] = Integer.MAX_VALUE;
			} 
			dist[st] = 0; // 시작점 대입


			// 인접리스트 생성 및 초기화
			adjList = new ArrayList[101];
			for (int idx = 0; idx <= 100; idx++) {
				adjList[idx] = new ArrayList<>();
			}

			// 방향이 존재하는 그래프의 간선 할당
			for (int edge = 1; edge <= n / 2; edge++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				adjList[from].add(to); // 유향그래프
			}
			
			// 다익스트라를 위한 우선순위 큐
			PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
				@Override
				public int compare(Node o1, Node o2) {
					return o1.w - o2.w; // 오름차순
				}
			});

			// 시작 노드 생성
			Node stnode = new Node(st, 0);
			pq.add(stnode);

			// 다익스트라
			out: while (!pq.isEmpty()) {
				Node node = pq.remove();

				while (true) {
					if (!visited[node.v]) {
						break;
					}
					if (pq.isEmpty()) {
						break out;
					}
					node = pq.remove();
				}

				visited[node.v] = true; // 방문처리

				for (int idx = 0; idx < adjList[node.v].size(); idx++) {
					int end = adjList[node.v].get(idx);// 이번에 방문한 정점에 연결된 idx번째 간선의 종점
					if (!visited[end] && dist[node.v] + 1 < dist[end]) {
						dist[end] = dist[node.v] + 1;
					}
					Node nn = new Node(end, dist[end]);
					pq.offer(nn);
				}
			}

			int max = 0;
			int ans = -1;
			for (int i = 1; i <= 100; i++) {
				if (dist[i] != Integer.MAX_VALUE && dist[i] >= max) {
					max = dist[i];
					ans = i;
				}
			}
			
			// 정답 출력
			System.out.printf("#%d %d\n", t, ans);
		}
	}
}