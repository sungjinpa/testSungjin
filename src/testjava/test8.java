package testjava;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		sc.close();
		
		//4�� ������
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				System.out.println("1 - ���� ����");
				
			} else if (year % 100 != 0) {
				System.out.println("1 - �ι�° ���� ����");
				
			} else {
				System.out.println("0 - 4�� ������� ������ �ƴ�");
				
			}
		} else {
			System.out.println("0 - ���ʿ� 4�� ������ƴ�");
		}
	}
}
