package testjava;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int totalScore = sc.nextInt();
		sc.close();
		
		
		 if(totalScore >= 90 || totalScore > 100) { System.out.println("당신의 학점은 A");
		 
		 }else if(totalScore >= 80 || totalScore > 90){
		 System.out.println("당신의 학점은 B");
		 
		 }else if(totalScore >= 70 || totalScore > 80){
		 System.out.println("당신의 학점은 C");
		 
		 }else if(totalScore >= 60 || totalScore > 70){
		 System.out.println("당신의 학점은 D");
		 
		 
		 }else System.out.println("낙제");
		 
		/* 
		if(totalScore>=90) System.out.println("A");
		else if(totalScore>=80) System.out.println("B");
		else if (totalScore>=70) System.out.println("C");
		else if(totalScore>=60) System.out.println("D");
		else System.out.println("F");
		*/
		
	}
}
	

