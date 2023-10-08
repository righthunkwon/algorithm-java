package level_99_dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 특정 거리의 도시 찾기
// 모든 간선의 가중치가 1인 경우에는 BFS로도 풀 수 있지만
// 다익스트라를 연습하기 위해 다익스트라로 풀이한 문제이다.

// 다익스트라 알고리즘
// 그래프의 최단 경로를 구하는 알고리즘
// 하나의 정점에서 출발하는 최단 거리를 구함
// 음수 가중치가 없어야 함(가중치가 음수인 간선이 없어야 함)
// 우선순위큐를 활용하여 시간복잡도 개선 가능(m log n)

// 다익스트라 알고리즘의 과정
// 1) 출발 노드 입력
// 2) 최단거리 테이블 초기화(MAX_VALUE) 및 출발 노드 설정(값 변경)
// 3) 방문하지 않은 노드 중 최단거리(최소 가중치를 가진 간선)를 갖는 노드 선택
// 4) 해당 노드를 거쳐 다른 노드로 가는 비용을 계산하여 비용이 더 적으면 최단거리 테이블을  갱신
// 5) 3, 4번의 과정을 반복

// dist				: 출발지에서 최소 거리를 기록하는 테이블
// visited			: 정점의 방문 여부 확인
// priority queue	: 출발지에서 정점까지 가는 최소 거리를 저장하는 우선순위 큐
public class P_18352 {

	private static int N, M, K, X;
	private static int[] dist;
	private static boolean[] visited;
	private static List<List<City>> adjList;

	private static class City implements Comparable<City> {
		int cityNum;
		int weight;

		public City(int cityNum, int weight) {
			this.cityNum = cityNum;
			this.weight = weight;
		}

		@Override
		public int compareTo(City o) {
			return weight - o.weight;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		K = Integer.parseInt(st.nextToken()); // 최단 거리 정보
		X = Integer.parseInt(st.nextToken()); // 출발 정점의 번호

		adjList = new ArrayList<>(); // 초기화
		for (int i = 0; i <= N; i++) {
			adjList.add(new ArrayList<>());
		}

		// 간선을 저장
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adjList.get(x).add(new City(y, 1));
		}

		// 시작 정점으로부터 각 정점까지의 최단거리 배열
		dist = new int[N + 1]; // 최단거리 테이블
		Arrays.fill(dist, Integer.MAX_VALUE); // 최댓값으로 초기화

		// 시작 정점으로부터 다익스트라
		dijkstra(X);

		// 다익스트라의 결과로 dist가 최단거리인 사람들은 스트링빌더에 추가
		for (int i = 1; i < dist.length; i++) {
			if (dist[i] == K) {
				sb.append(i).append('\n');
			}
		}

		// 정답 출력
		if (sb.length() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sb);
		}
	}

	private static void dijkstra(int cityNum) {

		PriorityQueue<City> q = new PriorityQueue<>();
		visited = new boolean[N + 1]; // 방문테이블
		dist[cityNum] = 0; // 시작 정점 초기화

		q.offer(new City(cityNum, 0));

		while (!q.isEmpty()) {
			City city = q.poll();
			int num = city.cityNum;

			if (visited[num]) {
				continue;
			}
			visited[num] = true;

			for (City c : adjList.get(num)) {
				if (!visited[c.cityNum] && dist[c.cityNum] > (c.weight + dist[num])) {
					dist[c.cityNum] = c.weight + dist[num];
					q.offer(new City(c.cityNum, dist[c.cityNum]));
				}
			}
		}

	}
}
