package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		/*키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		 * ex. 문자 : A
		 * A unicode : 65
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		//String input = sc.next(); // A
		//char result = input.charAt(0);
		
		char input = sc.next().charAt(0); //
		
		
		System.out.printf("%s unicode : %d", input, (int)input);
		
		
	}

}
