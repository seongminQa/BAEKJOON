import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int wordCnt = Integer.parseInt(br.readLine());
		String[] word = new String[wordCnt];
		int cnt = wordCnt;
		
		for(int i=0; i<wordCnt; i++) {
			word[i] = br.readLine();
			
			for(int j=0; j<word[i].length()-1; j++) {
				if(word[i].charAt(j) == word[i].charAt(j+1)) {
					continue;
				} else if(word[i].substring(j+1).contains(String.valueOf(word[i].charAt(j)))) {
					cnt--;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
