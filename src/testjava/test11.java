package testjava;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();
		// a, b, c ������ ��� �ٸ� ���
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
		// ��� �� �� �̻��� ���� ���� ������ ������ ���
		else {
			// 3���� ������ ��� ���� ���
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a�� bȤ�� c���� ���� ���
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b�� c�� ���� ���
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}