package testjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();

		StringTokenizer sti = new StringTokenizer(str, " ");
		int A = Integer.parseInt(sti.nextToken());
		int B = Integer.parseInt(sti.nextToken());
			System.out.println(A+B);
	}

}
