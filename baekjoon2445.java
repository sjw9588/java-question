package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2445 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i <n; i++) {
			for(int j=n-i; j<=n; j++) {
				bw.write("*");
			}
			
			for (int k = 2 * i; k < 2 * n - 2; k++) {
				bw.write(" ");
			}
			for(int j=n-i; j<=n; j++) {
				bw.write("*");
			}

			bw.newLine();
		}
		for(int i=0; i<n-1;i++) {
			for(int j=i; j<n-1; j++) {
				bw.write("*");
			}			
			for (int k = 2 * i+2; k >0; k--) {
				bw.write(" ");
			}
			for(int j=i; j<n-1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}