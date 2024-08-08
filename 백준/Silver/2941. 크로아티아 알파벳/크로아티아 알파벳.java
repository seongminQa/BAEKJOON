import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dic = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int repeat = 0;
		
		String input = br.readLine();
		
		while(true) {
			if(repeat >= dic.length) {
				System.out.println(input.length());
				break;
			}
			
			if(input.contains(dic[repeat])) {
				input = input.replaceAll(dic[repeat], "0");
				continue;
			} else {
				repeat++;				
			}
		}
	}
}
