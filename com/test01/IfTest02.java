package com.test01;

public class IfTest02 {
	
	
	//if - else if - else문
	//다중 조건을 줄 수 있다.
	public void testElseIf() {
		
		int num1 = 50;
		int num2 = 20;
		
		if(num1 > num2) {//if문의 조건식
			System.out.println(num1+ "은 " + num2 + "보다 큽니다.");//if문의 조건식이 참일 경우 수행할 코드
		}
		else if(num1 < num2) {//else if문의 조건식. 앞의 if문 조건식의 결과 값이 거짓일 경우 수행.
			System.out.println(num1 + "은 " + num2 + "보다 작습니다.");//else if문의 조건식이 참일 경우 수행할 코드
		}
		else {//if문의 조건식과 else if문의 조건식의 결과 값이 모두 거짓일 경우 수행
			System.out.println(num1 + "은 " + num2 + "이랑 같습니다.");
		}
			
	}
	
	public void testElseIf02() {
		
		System.out.print("점수 입력: ");
		
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int score = scn.nextInt();
		
		scn.close();
		
		char grade;
		
		if(score >= 90) {//if문 조건식
			grade = 'A';//if문 조건식의 결과 값이 참이면 수행
		}
		else if(score < 90 && score >= 80) {//else if문의 조건식. if문의 조건식의 결과 값이 거짓이면 수행.
			grade = 'B';//if문의 조건식의 결과 값이 거짓이고, else if문의 결과 값이 참이면 수행할 코드
		}
		else if(score < 80 && score >= 70) {//else if문의 조건식. if문의 조건식과 앞선 else if문의 결과 값이 거짓이면 수행.
			grade = 'C';//앞선 if문과 else if문의 조건식 결과 값이 거짓이고, 해당 else if문의 결과 같이 참이면 수행할 코드
		}
		else if(score < 70 && score >= 60) {
			grade = 'D';
		}
		else grade = 'F';//앞선 모든 if, else if문의 결과 값이 거짓이면 수행할 코드
		
		System.out.printf("당신의 점수는 %d이고, 등급은 %c 입니다.", score, grade);
		
	}
	
}
