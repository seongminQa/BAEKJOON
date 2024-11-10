import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static int n;
	public static boolean[][] maps;
	public static boolean[][] visited;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int houseCnt;
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		++houseCnt;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && maps[nx][ny]) {
				dfs(nx, ny);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		maps = new boolean[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				maps[i][j] = s.charAt(j) == '1';
			}
		}

		List<Integer> houseCnts = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(maps[i][j] && !visited[i][j]) {
					houseCnt = 0; // 새로운 단지를 탐색할 때마다 집의 수를 초기화함
					dfs(i, j); // 해당 단지에 속한 집들을 탐색
					houseCnts.add(houseCnt); // 단지별 집 수를 저장
				}
			}
		}

		Collections.sort(houseCnts);
		System.out.println(houseCnts.size());
		for(int i : houseCnts) {
			System.out.println(i);
		}
	}
}
