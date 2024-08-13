import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstIndex = Integer.parseInt(st.nextToken());
		int secondIndex = Integer.parseInt(st.nextToken());
		
		int[][] matrix1 = new int[firstIndex][secondIndex];
		int[][] matrix2 = new int[firstIndex][secondIndex];
		
		for(int i=0; i<firstIndex; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<secondIndex; j++) {
				matrix1[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i=0; i<firstIndex; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<secondIndex; j++) {
				matrix2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<firstIndex; i++) {
			for(int j=0; j<secondIndex; j++) {
				System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
