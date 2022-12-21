package testjava;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		sc.close();
		
		//4의 배수라면
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				System.out.println("1 - 정상 윤년");
				
			} else if (year % 100 != 0) {
				System.out.println("1 - 두번째 정상 윤년");
				
			} else {
				System.out.println("0 - 4의 배수지만 윤년이 아님");
				
			}
		} else {
			System.out.println("0 - 애초에 4의 배수가아님");
		}
	}
}
