package testjava;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		// x�� ����ϰ��
		// 1,4 ��и�
		if (x > 0) {
			if (y > 0) {
				System.out.println("�� 1��и�");
			} else {
				System.out.println("�� 4��и�");
			}
			// x�� �����ϰ��
			// 2,3 ��и�
		} else {
			// x�� �����̸鼭 y�� ����ϰ��
			if (y > 0) {
				System.out.println("�� 2��и�");
			} else {
				System.out.println("�� 3��и�");
			}

		}
	}
}
