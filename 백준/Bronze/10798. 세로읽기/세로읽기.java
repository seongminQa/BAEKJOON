import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = new String[5];
		
		for(int i=0; i<5; i++) {
			word[i] = br.readLine();
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(word[j].length() > i) {
					System.out.print(word[j].charAt(i));					
				} else {
					continue;					
				}
			}
		}
	}
}
