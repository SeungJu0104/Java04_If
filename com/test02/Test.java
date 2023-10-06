package com.test02;

import java.util.Scanner;

public class Test {
	
	Scanner sc = new Scanner(System.in);
	
	//Q. 입력받은 수가 5의 배수이면 "5의 배수입니다."를 출력한다.
	
	public void test01(int no) {//()안에 변수를 선언한 것이다.
		
		System.out.print("숫자 입력 : ");
		no = sc.nextInt();
		
		if(no % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		
	}
	
	/*Q. 입력받은 수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다."를 출력한다.
	 * 	 아니라면, "2와 3의 배수가 아닙니다."를 출력한다.
	 */	 
	public void test02(int no) {//()안에 변수를 선언한 것이다.
		
		System.out.print("숫자 입력 : ");
		no = sc.nextInt();
		
		if(no % 2 == 0 && no % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
		}
		
		else System.out.println("2와 3의 배수가 아닙니다.");
		
		
	}
	
	/*Q. 입력받은 문자가 소문자라면 "소문자입니다."를,
	 * 	 대문자라면 "대문자입니다."를 출력한다.
	 */
	public void test03(char ch) {//()안에 변수를 선언한 것이다.
		
		System.out.print("문자 입력 : ");
		ch = sc.next().charAt(0);
		
		if((ch >= 'a') && (ch <= 'z')) {
			System.out.println("소문자입니다.");
		}
		else if((ch >= 'A') && (ch <= 'Z')) {
			System.out.println("대문자입니다.");
		}
		else System.out.println("잘못된 글자입니다.");
		
		
		
	}
	

}
