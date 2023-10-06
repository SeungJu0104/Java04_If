package com.test02;

public class TestMain {

	public static void main(String[] args) {
		
		//1.
		Test t1 = new Test();
		 t1.test01(0);//()안에 적은 값으로 test01 메소드의 ()안에 변수를 초기화시킨다.
		 t1.test02(0);//()안에 적은 값으로 test02 메소드의 ()안에 변수를 초기화시킨다.
		 t1.test03('A');//()안에 적은 값으로 test03 메소드의 ()안에 변수를 초기화시킨다.
		 
		 //2.
		 //new Test().test01(0);
		 //new Test().test02(0);
		 //new Test().test03(0);

	}

}
