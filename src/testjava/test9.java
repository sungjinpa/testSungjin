package testjava;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		// x가 양수일경우
		// 1,4 사분면
		if (x > 0) {
			if (y > 0) {
				System.out.println("제 1사분면");
			} else {
				System.out.println("제 4사분면");
			}
			// x가 음수일경우
			// 2,3 사분면
		} else {
			// x가 음수이면서 y가 양수일경우
			if (y > 0) {
				System.out.println("제 2사분면");
			} else {
				System.out.println("제 3사분면");
			}

		}
	}
}
