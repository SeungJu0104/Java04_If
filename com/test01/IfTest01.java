package com.test01;

public class IfTest01 {
	
	//if문
	//if(조건식) {조건식이 참일 경우 실행할 코드}
	//조건식의 결과 값은 반드시 논리 값(true, false)을 가져야한다.
	//조건식의 결과 값이 참이면 { }안에 있는 코드를 실행.
	//조건식의 결과 값이 거짓이면 { }안에 있는 코드는 미실행.
	//{ }는 경우에 따라 생략해도 무방.
	public void testIf() {
		
		int num = 5;
		
		if(num % 2 == 0) {//num이 짝수인지 아닌지 확인하는 조건문
			System.out.println("짝수입니다.");//참이면 { }내의 출력문 실행. 거짓이면 실행하지 않는다.
		}
		
		if(num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("종료");
		
	}
	
	//if - else문
	//if(조건식) {조건식의 결과 값이 참일 경우 수행할 코드} else {조건식의 결과 값이 거짓일 경우 수행할 코드};
	//If문의 조건식의 결과 값이 참인 경우 If문의 { }내에 코드를 실행. If문의 조건식의 결과 값이 거짓인 경우 else문의 { }내에 코드를 실행.
	//조건식의 결과 값이 참인지 거짓인지에 따라 코드를 수행.
	//if문을 2번 사용하는 것보다 조건식을 1번만 확인하므로 동작 속도가 상대적으로 빠르다.
	//{ }는 경우에 따라 생략해도 무방.
	public void testIfElse01() {
		
		int num = 5;
		
		if(num % 2 == 0) {//()안의 코드는 조건식
			System.out.println("짝수입니다.");//조건식의 결과 값이 참이면 실행할 코드. 거짓이면 실행하지 않는다.
		}
		
		else {
			System.out.println("홀수입니다.");//조건식의 결과 값이 거짓일 경우 실행할 코드
		}
		
	}
	//중첩 if문
	public void testIfElse02() {
		
		int num = 53;
		/*
		if(num >= 50) //()안의 코드는 조건식
			System.out.println("50보다 크다.");//조건식의 결과 값이 참이면 실행할 코드
			//{ }는 경우에 따라 생략해도 무방.
		else 
			System.out.println("50보다 작다.");//조건식의 결과 값이 거짓이면 실행할 코드
			//{ }는 경우에 따라 생략해도 무방.
		*/
		
		if(num >= 50) {//if문의 조건식
			if(num % 2 == 0) {//중첩 if문의 조건식
				System.out.println("50보다 큰 짝수");//if문의 조건식과 중첩 if문의 조건식의 결과 값이 참이면 실행할 코드
			}
			else System.out.println("50보다 큰 홀수");//if문의 조건식의 결과 값은 참이지만 중첩 if문의 조건식의 결과 값이 거짓이면 실행할 코드
			//{ }는 경우에 따라 생략해도 무방.
		}
		else System.out.println("50보다 작다.");//if문의 조건식의 결과 값이 거짓일 경우 실행할 코드
		
		
	}
	
	public void testIfElse03() {
		//정수 하나 입력 받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다."라고 출력
		//중첩 if - else문 이용할 것.
		
		System.out.print("정수 입력: ");
		
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int no = scn.nextInt();
		
		if(no >= 0) {
			
			if(no == 0) {
				System.out.println("0입니다.");
			}
			else System.out.println("양수");
		}
		
		if(no < 0) {
			
				System.out.println("음수");
			}
		}
		
		
		
			
}
	
	
	


