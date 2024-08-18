import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[9][9];
		int max = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;
		
		for(int i=0; i<=8; i++) {
			for(int j=0; j<=8; j++) {
				matrix[i][j] = sc.nextInt();
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
