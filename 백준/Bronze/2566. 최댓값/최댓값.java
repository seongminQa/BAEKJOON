import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = new int[9][9];
		int max = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;
		
		for(int i=0; i<=8; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<=8; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
				if(max <= matrix[i][j]) {
					max = matrix[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((row+1) + " " + (col+1));
	}
}
