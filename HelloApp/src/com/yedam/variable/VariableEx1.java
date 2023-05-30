package com.yedam.variable;

public class VariableEx1 {
	public static void main(String[] args) {
		//변수: 변하는 값을 저장.
		int num1; // 음의 정수, 0 ,양의 정수
		num1 = 100;
		num1 = -100;
		double num2;
		num2 = -1.2;
		num2 = 132; // 정수 -> 실수 내부적으로 형변환.
	
		double result = 0;
		result = (double) num1 + num2; //변수의 범위 int < double
		System.out.println("결과 :" + result);
		
		System.out.println(Integer.MAX_VALUE);
		byte b1 = 127;
		short s1 = 128;
		long l1 =2147483648L;
		long result1 = (long)b1 + (long)s1 + l1;
		
		b1++;
		
		System.out.println("b1의 값: " + b1);
	}
}

//변수의 종류
// 정수: byte (1byte) , 
