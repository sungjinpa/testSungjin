package testjava;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();
		// a, b, c 변수가 모두 다를 경우
		if (a != b && a != c && b != c) {
			int max;

			// c < a < b
			if (a > b) {
				if (a < c) {
					max = c;
					// a > (b, c)
				} else {
					max = a;
				}
			}
			// c > b > a
			else {
				if (c > b) {
					max = c;

					// b > (a, c)
				} else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			// 3개의 변수가 모두 같은 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a가 b혹은 c랑만 같은 경우
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b가 c랑 같은 경우
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}