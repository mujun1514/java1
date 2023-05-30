package com.yedam.operaeor;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드: 함수인데 객체에 소속되어있는 메소드.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			System.out.print("숫자를 입력하세요:");
			num1 = scn.nextInt();
			System.out.print("숫자를 입력하세요:");
			num2 = scn.nextInt(); // 함수가 객체에 소속되어있는것을 메소드
			
			if(num1>num2) {
				for (int i = num2; i <= num1; i++) {
					if (i % 2 == 0) {
						result += i;
					}
				}
			}else
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					result += i;
				}
			}
			System.out.println("짝수의 합:" + result);
		} catch (Exception e) {
			System.out.print("숫자가 아닌 값을 입력하였습니다.");
		}

		
		scn.close(); // resource 환원.

	}
}
