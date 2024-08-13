import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int firstIndex = sc.nextInt();
		int secondIndex = sc.nextInt();
		
		int[][] matrix1 = new int[firstIndex][secondIndex];
		int[][] matrix2 = new int[firstIndex][secondIndex];

		for(int i=0; i<firstIndex; i++) {
			for(int j=0; j<secondIndex; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<firstIndex; i++) {
			for(int j=0; j<secondIndex; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
