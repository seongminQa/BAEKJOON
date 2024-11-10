import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static final int MAX = 100000;
	public static boolean[] visited = new boolean[MAX+1];
	public static int n;
	public static int k;
	public static int[] dx = {-1, 1};
	
	public static int bfs(int n, int k) {
		if(n == k) return 0;
		
		Queue<int[]> queue = new LinkedList<>();
		
		// 시작점 초기화 위치, 초
		queue.offer(new int[] {n, 0});
		visited[n] = true;
		
		// BFS 탐색 시작
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int position = current[0];
			int time = current[1];
			
			// 이동할 수 있는 경우
			int[] nextPositions = {position-1, position+1, position*2};
			
			for(int next : nextPositions) {
				if(next == k) {
					return time + 1;
				}
				
				if(next >= 0 && next <= MAX && !visited[next]) {
					visited[next] = true;
					queue.offer(new int[] {next, time+1});
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		System.out.println(bfs(n, k));
	}

}
