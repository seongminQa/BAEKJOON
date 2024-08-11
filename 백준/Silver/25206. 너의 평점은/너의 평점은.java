import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double totalScore = 0;
		double result = 0;

		for (int i = 0; i < 20; i++) {
			String[] input = br.readLine().split(" ");

			switch (input[2]) {
			case "A+":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 4.5;
				break;
			case "A0":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 4.0;
				break;
			case "B+":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 3.5;
				break;
			case "B0":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 3.0;
				break;
			case "C+":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 2.5;
				break;
			case "C0":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 2.0;
				break;
			case "D+":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 1.5;
				break;
			case "D0":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 1.0;
				break;
			case "F":
				totalScore += Double.parseDouble(input[1]);
				result += Double.parseDouble(input[1]) * 0.0;
				break;
			default:
				break;
			}
		}
		System.out.println((double)Math.round(result/totalScore*1000000)/1000000);
	}

}
